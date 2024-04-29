package Test2022_10_27;
    public class Complex {
        public double realPart;
        public double imaginaryPart;

        public Complex()
        {
            this.imaginaryPart=0;
            this.realPart=0;
        }

        public Complex(double realPart,double imaginaryPart)
        {
            this.imaginaryPart=imaginaryPart;
            this.realPart=realPart;
        }


        public double getRealPart() {
            return realPart;
        }

        public void setRealPart(double realPart) {
            this.realPart = realPart;
        }

        public double getImaginaryPart() {
            return imaginaryPart;
        }

        public void setImaginaryPart(double imaginaryPart) {
            this.imaginaryPart = imaginaryPart;
        }

        public Complex add(Complex a,Complex b)
        {
            return new Complex(a.realPart+b.realPart,a.imaginaryPart+b.imaginaryPart);
        }

        public Complex subduction(Complex a,Complex b)
        {
            return new Complex(a.realPart-b.realPart,a.imaginaryPart-b.imaginaryPart);
        }

        public Complex multiplication(Complex a,Complex b)
        {
            return new Complex((a.realPart*b.realPart-a.imaginaryPart*b.imaginaryPart),(a.realPart*b.imaginaryPart+a.imaginaryPart*b.realPart));
        }

        public Complex division(Complex a, Complex b)
        {
            if(b.realPart==0&&b.imaginaryPart==0)
            {
                System.out.println("除数不能为零");
            }
            return new Complex(((a.realPart*b.realPart+a.imaginaryPart*b.imaginaryPart)/(b.realPart*b.realPart+b.imaginaryPart*b.imaginaryPart)),((a.imaginaryPart*b.realPart-a.realPart*b.imaginaryPart)/(b.realPart*b.realPart+b.imaginaryPart*b.imaginaryPart)));
        }


        public static double module(Complex a)
        {
            double x=a.realPart*a.realPart+a.imaginaryPart*a.imaginaryPart;
            return Math.sqrt(x);
        }

        public void print()
        {
            if(this.imaginaryPart<0)//当复数的虚部为负数时，避免多打印出一个"+"
            {
                System.out.println(this.realPart+""+this.imaginaryPart+"i");
            }
            else
            {
                System.out.println(this.realPart+"+"+this.imaginaryPart+"i");
            }
        }



    }



