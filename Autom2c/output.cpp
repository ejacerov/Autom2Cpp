#include <stdio.h>
#include <iostream>
#include <string>
#include <vector>
using std::vector;
using namespace std;
int n_rule=3 ;
string test_st_a="a";
string test_st_b="b";
string test_st_X1="X1";
string test_ev_y="y";
string test_ev_z="z";
string test_ev_x="x";
int test_trans=4;
vector<vector<string>> test_Rules; 
// Automata Generado: Automata_test()

void Automata_test()
{ 
test_Rules.resize(n_rule);
  for (int i = 0; i < n_rule; ++i)   {test_Rules[i].resize(test_trans);}
	test_Rules[0][0]=test_st_X1;
	test_Rules[1][0]=test_ev_y;
	test_Rules[2][0]=test_st_b;
	test_Rules[0][1]=test_st_b;
	test_Rules[1][1]=test_ev_z;
	test_Rules[2][1]=test_st_a;
	test_Rules[0][2]=test_st_a;
	test_Rules[1][2]=test_ev_x;
	test_Rules[2][2]=test_st_X1;
	test_Rules[0][3]=test_st_X1;
	test_Rules[1][3]=test_ev_z;
	test_Rules[2][3]=test_st_a;
}
string test2_st_a2="a2";
string test2_st_b2="b2";
string test2_ev_y2="y2";
string test2_ev_z2="z2";
string test2_ev_x2="x2";
int test2_trans=3;
vector<vector<string>> test2_Rules; 
// Automata Generado: Automata_test2()

void Automata_test2()
{ 
test2_Rules.resize(n_rule);
  for (int i = 0; i < n_rule; ++i)   {test2_Rules[i].resize(test2_trans);}
	test2_Rules[0][0]=test2_st_b2;
	test2_Rules[1][0]=test2_ev_z2;
	test2_Rules[2][0]=test2_st_a2;
	test2_Rules[0][1]=test2_st_a2;
	test2_Rules[1][1]=test2_ev_x2;
	test2_Rules[2][1]=test2_st_b2;
	test2_Rules[0][2]=test2_st_b2;
	test2_Rules[1][2]=test2_ev_y2;
	test2_Rules[2][2]=test2_st_b2;
}
string test3_st_a3="a3";
string test3_st_b3="b3";
string test3_ev_y3="y3";
string test3_ev_z3="z3";
string test3_ev_x3="x3";
int test3_trans=3;
vector<vector<string>> test3_Rules; 
// Automata Generado: Automata_test3()

void Automata_test3()
{ 
test3_Rules.resize(n_rule);
  for (int i = 0; i < n_rule; ++i)   {test3_Rules[i].resize(test3_trans);}
	test3_Rules[0][0]=test3_st_b3;
	test3_Rules[1][0]=test3_ev_z3;
	test3_Rules[2][0]=test3_st_a3;
	test3_Rules[0][1]=test3_st_a3;
	test3_Rules[1][1]=test3_ev_x3;
	test3_Rules[2][1]=test3_st_b3;
	test3_Rules[0][2]=test3_st_a3;
	test3_Rules[1][2]=test3_ev_y3;
	test3_Rules[2][2]=test3_st_a3;
}
// Executing actions for automatas 
int main(){ 
Automata_test2();
printf("Estado  Evento  Estado\n");
for(int cntr=0; cntr< test2_trans; cntr++) 
{ 
	for(int cntc=0; cntc< n_rule; cntc++ ) 
	{
		cout<<test2_Rules[cntc][cntr]<<" 	 ";
	} 
	printf(" \n ");
 }
//Testing automata test2 
int test2_naux=0;
string test2_saux;
cout<<"Estado Inicial: "<<test2_Rules[0][0]<<"\n" ; 
printf(" Probando la cadena : z2, x2, y2, y2, y2, y2, x2\n");
if (test2_ev_z2==test2_Rules[1][test2_naux]){
for(int a=1; a< test2_trans; a++ ){
test2_saux.clear();
if(test2_Rules[2][test2_naux]==test2_Rules[0][a]){
test2_naux=a;
test2_saux=test2_Rules[0][a];
cout<<"Transicion al estado: "<<test2_saux<<" \n "; 
break;
}}if (test2_ev_x2==test2_Rules[1][test2_naux]){
for(int a=1; a< test2_trans; a++ ){
test2_saux.clear();
if(test2_Rules[2][test2_naux]==test2_Rules[0][a]){
test2_naux=a;
test2_saux=test2_Rules[0][a];
cout<<"Transicion al estado: "<<test2_saux<<" \n "; 
break;
}}if (test2_ev_y2==test2_Rules[1][test2_naux]){
for(int a=1; a< test2_trans; a++ ){
test2_saux.clear();
if(test2_Rules[2][test2_naux]==test2_Rules[0][a]){
test2_naux=a;
test2_saux=test2_Rules[0][a];
cout<<"Transicion al estado: "<<test2_saux<<" \n "; 
break;
}}if (test2_ev_y2==test2_Rules[1][test2_naux]){
for(int a=1; a< test2_trans; a++ ){
test2_saux.clear();
if(test2_Rules[2][test2_naux]==test2_Rules[0][a]){
test2_naux=a;
test2_saux=test2_Rules[0][a];
cout<<"Transicion al estado: "<<test2_saux<<" \n "; 
break;
}}if (test2_ev_y2==test2_Rules[1][test2_naux]){
for(int a=1; a< test2_trans; a++ ){
test2_saux.clear();
if(test2_Rules[2][test2_naux]==test2_Rules[0][a]){
test2_naux=a;
test2_saux=test2_Rules[0][a];
cout<<"Transicion al estado: "<<test2_saux<<" \n "; 
break;
}}if (test2_ev_y2==test2_Rules[1][test2_naux]){
for(int a=1; a< test2_trans; a++ ){
test2_saux.clear();
if(test2_Rules[2][test2_naux]==test2_Rules[0][a]){
test2_naux=a;
test2_saux=test2_Rules[0][a];
cout<<"Transicion al estado: "<<test2_saux<<" \n "; 
break;
}}if (test2_ev_x2==test2_Rules[1][test2_naux]){
for(int a=1; a< test2_trans; a++ ){
test2_saux.clear();
if(test2_Rules[2][test2_naux]==test2_Rules[0][a]){
test2_naux=a;
test2_saux=test2_Rules[0][a];
cout<<"Transicion al estado: "<<test2_saux<<" \n "; 
printf("Fin de la cadena, valida para el automata test2 \n " );
break;
}}}else {
 printf(" el evento en la posicion 7 no lleva a ningun estado");
}
}else {
 printf(" el evento en la posicion 6 no lleva a ningun estado");
}
}else {
 printf(" el evento en la posicion 5 no lleva a ningun estado");
}
}else {
 printf(" el evento en la posicion 4 no lleva a ningun estado");
}
}else {
 printf(" el evento en la posicion 3 no lleva a ningun estado");
}
}else {
 printf(" el evento en la posicion 2 no lleva a ningun estado");
}
}else {
 printf(" el evento en la posicion 1 no lleva a ningun estado");
}
}