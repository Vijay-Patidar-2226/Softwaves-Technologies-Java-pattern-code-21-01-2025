class Pattern15
{
static public void main(String [] ar)
{
int i,j;

for(i=1;i<=5;i++){

for(j=1;j<=5;j++){

if(i>=j){

System.out.print(j);
}

else
{
System.out.print("*");
}
}

System.out.println();

}

}

}

/*   o/p=>     
          1****
          12***
          123**
          1234*
          12345

*/