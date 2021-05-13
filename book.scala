object book extends App{
def sale(n:Int) = if (n > 50)  24.95*60/100*n+(n-50)*0.75+50*3 else  24.95*60/100*n+n*3;

   println(sale(60));
}
