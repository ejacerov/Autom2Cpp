import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class MyVisitor<T> extends  Autom2cBaseVisitor<T> {
    //Set tag for hash table : TagName+Ev/st+Name
    Boolean ans = false;
    String Automata_name="Automata_";
    int nMatrixsize=0;
    int State_num;
    int event_num;
    int nRules=3;
    String TagName;
    String strans="_trans";
    String mRule="n_rule";
    String sRule="_Rules";
    String ev_tag="_ev_";
    String st_tag="_st_";
    String Aut_tag="auto_";
    String n_states="_states";
    String n_events="_events";
    //String Autonm;
    int currentTrans;
    HashMap<String, Object> table = new HashMap<>();
    String Final_data="#include <stdio.h>\n" +
            "#include <iostream>\n" +
            "#include <string>\n" +
            "#include <vector>\n" +
            "using std::vector;\n" +
            "using namespace std;\n"+
            "int "+ mRule+ "=3 ;\n" ;

    @Override
    public T visitAutonm(Autom2cParser.AutonmContext ctx) {
        TagName = ctx.ID().getText();
        Automata_name="Automata_";
       // System.out.println(TagName);
        if (table.get(Aut_tag+ TagName) != null) {
            System.err.println("La etiqueta " + TagName + "Ya fue usada para definir un automata");
            System.exit(-1);
            return null;
        } else {
            table.put(Aut_tag+ TagName, (T) TagName);
            Automata_name+= TagName +"()\n";
           // System.out.println(Aut_tag+ TagName);
            return super.visitAutonm(ctx);
        }

    }


    @Override
    public T visitState_set(Autom2cParser.State_setContext ctx) {
        State_num= ctx.state().size();
       // Final_data+="int "+TagName+n_states+"="+State_num+";\n";
        for(int i=0; i <State_num;i++){
            String evnm=ctx.state(i).ID().getText();

            if(table.get(TagName+st_tag+evnm)!=null)
            {

                int line = ctx.state(i).ID().getSymbol().getLine();
                int col = ctx.state(i).ID().getSymbol().getCharPositionInLine() + 1;
                System.err.printf("<%d:%d> Error semantico, el estado  con nombre: \"" + evnm + "\" ya fue declarada. \n", line, col);
                System.exit(-1);
            }
            else{
                //System.out.println("event registered"+ visitEvent(ctx.event(i)));
                Final_data+="string "+ TagName+ st_tag+evnm+"=\""+evnm+"\";\n";
                table.put(TagName+st_tag +evnm,visitState(ctx.state(i)));

                // return super.visitState_set(ctx);
            }
        }
        return null;
    }

    @Override
    public T visitState(Autom2cParser.StateContext ctx) {
        String state=ctx.ID().getText();

        Object value;
        if ((table.get(TagName+st_tag +state))!=null)
        {
            int line = ctx.ID().getSymbol().getLine();
            int col =ctx.ID().getSymbol().getCharPositionInLine()+1;
            System.err.printf("<%d:%d> Error semantico, la variable con nombre \"" +state+ "\" ya fue declarada.\n",line,col );
            System.exit(-1);
            return null;
        }
        else{
            //System.out.println("-> st : "+state);
            return  (T) state;
        }
    }



    @Override
    public T visitEvent_set(Autom2cParser.Event_setContext ctx) {
        event_num= ctx.event().size();
        //Final_data+="int "+TagName+n_events+"="+event_num+";\n";
        for(int i=0; i < event_num;i++){
            String evnm=ctx.event(i).ID().getText();

            if(table.get(TagName+ev_tag+evnm)!=null)
            {

                int line = ctx.event(i).ID().getSymbol().getLine();
                int col = ctx.event(i).ID().getSymbol().getCharPositionInLine() + 1;
                System.err.printf("<%d:%d> Error semantico, la variable con nombre: \"" + evnm + "\" ya fue declarada. \n", line, col);
                System.exit(-1);
            }
            else{
                //System.out.println("event registered"+ visitEvent(ctx.event(i)));

               Final_data+="string "+TagName+ev_tag+evnm+"=\""+evnm+"\";\n";
              // System.out.println(Final_data);
               table.put(TagName+ev_tag+evnm,visitEvent(ctx.event(i)));



            }
        }
        return null;

        //return super.visitEvent_set(ctx);
    }

    public T visitEvent(Autom2cParser.EventContext ctx)
    {
        String event=ctx.ID().getText();


        if ((table.get(TagName+ev_tag+event))!=null)
        {
            int line = ctx.ID().getSymbol().getLine();
            int col =ctx.ID().getSymbol().getCharPositionInLine()+1;
            System.err.printf("<%d:%d> Error semantico, el evento con nombre \""+event + "\" ya fue declarada.\n",line,col );
            System.exit(-1);
            return null;
        }
        else{
            //System.out.println("->"+event);
            return  (T) event;
        }
    }
    //Cuadrar la regla para ajustar el numero de transiciones y definir asi el tamaño de la matriz 3xN


      @Override
     public T visitTransitions(Autom2cParser.TransitionsContext ctx) {
          nMatrixsize=ctx.transition().size();
         // System.out.println("Number of transitions = "+nMaxtrixsize);
           Object s_transrule=0;
           Final_data+="int "+TagName+strans+"="+nMatrixsize+";\nvector<vector<string>> "+TagName+sRule+"; \n// Automata Generado: "+Automata_name+"\nvoid "+Automata_name+"{ \n"+
           TagName+sRule+".resize("+mRule+");\n"+"  for (int i = 0; i < "+mRule+"; ++i)   {"+TagName+sRule+"[i].resize("+TagName+strans+");}\n";
          for(currentTrans=0; currentTrans < nMatrixsize;currentTrans++)
          {
              //  s_transrule=String(visitEvent(ctx.transition(i))));
              s_transrule=visitTransition(ctx.transition(currentTrans));
              if(s_transrule==null)
              {
                  System.err.println("La transición no puede ser vacia \n");
                  System.exit(-1);
              }
              else{
                  Final_data+=s_transrule.toString();
                  //System.out.println(s_transrule.toString());
              }
            //System.out.println("Success");

          }
            Final_data+="}\n";
            System.out.println("Automata "+TagName +" Creado exitosamente. \n");

          return null;//super.visitTransitions(ctx);
      }
    @Override
    public T visitTransition(Autom2cParser.TransitionContext ctx) {
        String St1=null;
        String St2=null;
        String Evt=null;
        String transRule=null;
        int b= ctx.ID().size();

        if (b==2)
        {
            St1 =ctx.ID(0).getText();
            Evt =ctx.ID(1).getText();
            if(table.get(TagName+st_tag+St1)!=null) {
                if (table.get(TagName+ev_tag + Evt) != null) {
                    transRule="\t"+TagName+sRule+"[0]["+currentTrans+"]="+TagName+st_tag+St1+";\n";
                    transRule+="\t"+TagName+sRule+"[1]["+currentTrans+"]="+TagName+ev_tag+Evt+";\n";
                    transRule+="\t"+TagName+sRule+"[2]["+currentTrans+"]="+TagName+st_tag+St1+";\n";
                    //System.out.println(transRule);
                    return (T) transRule;
                }
                else
                {
                    System.err.println("El evento "+Evt +"no fue declarado \n");
                    System.exit(-1);
                }
            }
            else
            {
                System.err.println("El estado "+St1 +"no fue declarado \n");
                System.exit(-1);
            }

           // System.out.println("es un autolazo\n");
        }
        else if (b==3)
        {
            St1 =ctx.ID(0).getText();
            Evt =ctx.ID(1).getText();
            St2 =ctx.ID(2).getText();

            if(table.get(TagName+st_tag+St1)!=null) {
                if (table.get(TagName+st_tag + St2) != null) {
                    if (table.get(TagName+ev_tag + Evt) != null) {
                        transRule="\t"+TagName+sRule+"[0]["+currentTrans+"]="+TagName+st_tag+St1+";\n";
                        transRule+="\t"+TagName+sRule+"[1]["+currentTrans+"]="+TagName+ev_tag+Evt+";\n";
                        transRule+="\t"+TagName+sRule+"[2]["+currentTrans+"]="+TagName+st_tag+St2+";\n";
                        //System.out.println(transRule);
                        return (T) transRule;
                    }
                    else
                    {
                        System.err.println("El evento "+Evt +"no fue declarado \n");
                        System.exit(-1);
                    }
                }
                else{
                    System.err.println("El estado "+St2+"no fue declarado \n");
                    System.exit(-1);
                }
            }
            else{
                System.err.println("El estado "+St1+"no fue declarado \n");
                System.exit(-1);
            }
        }
        return  null;


    }

    @Override
    public T visitActions(Autom2cParser.ActionsContext ctx) {
        Final_data+= "// Executing actions for automatas \n"+
        "int main(){ \n";

        if(ctx.END()!=null)
        {
            Final_data+="printf(\"automatas have been declared. Nothing to do \");\n";
        }
        if(ctx.print()!=null)
        {
            for(int i=0;i<ctx.print().size();i++)
            visitPrint(ctx.print(i));
        }
        Final_data+="}";

        try {
            FileWriter myWriter = new FileWriter("output.cpp");
            myWriter.append(Final_data);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return null;
    }

   @Override
    public T visitPrint(Autom2cParser.PrintContext ctx) {
        String printTag=ctx.ID().getText();
        Object printRes;


      if(table.get(Aut_tag+ printTag)!=null)
      {
          Final_data+="Automata_"+printTag+"();\n";
          Final_data+="printf(\"Estado  Evento  Estado\\n\");";
          Final_data+= "\nfor(int cntr=0; cntr< "+printTag+strans+"; cntr++) \n{ \n"+
          "\tfor(int cntc=0; cntc< "+ mRule+"; cntc++ ) \n"+
          "\t{\n\t\tcout<<"+printTag+sRule+"[cntc][cntr]<<\" \t \";\n\t} \n"+
          "\tprintf(\" \\n \");\n }\n";
      }
      else
      {
          System.out.println("El automata "+printTag+" no existe \n");
          System.exit(-1);
      }

        return null;
    }
}