class Pattern25
{
static public void main(String [] ar)
{
int i,j;
int c=1;
for(i=1;i<=4;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(c);
c++;
}

System.out.println();
}
}
}


/* O/p=>
        1
        23
        456
        78910
*/
