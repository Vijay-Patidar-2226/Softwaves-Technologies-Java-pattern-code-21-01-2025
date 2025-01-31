class Pattern21
{
static public void main(String [] ar)
{
int i,j;

for(i=7;i>=1;i--)
{
for(j=i;j>=1;j--)
{
System.out.print(j%2);
}

System.out.println();

}
}
}


/*  o/p=>
         1010101
         010101
         10101
         0101
         101
         01
         1
*/