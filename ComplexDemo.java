package exam;

public class ComplexDemo {
    public static Complex sum(Complex a, Complex b)
    {
        Complex tong = new Complex(0, 0);
        tong.realPart = a.realPart + b.realPart;
        tong.imaginaryPart = a.imaginaryPart + b.imaginaryPart;
        return tong;
    }
    public static Complex subtract(Complex a, Complex b)
    {
        Complex hieu = new Complex(0, 0);
        hieu.realPart = a.realPart - b.realPart;
        hieu.imaginaryPart = a.imaginaryPart - b.imaginaryPart;
        return hieu;
    }
    public static Complex multiply(Complex a, Complex b)
    {
        Complex tich = new Complex(0,0);
        tich.realPart = a.realPart*b.realPart - a.imaginaryPart*b.imaginaryPart;
        tich.imaginaryPart = a.realPart*b.imaginaryPart + a.imaginaryPart*b.realPart;
        return tich;
    }
    public static Complex divide(Complex a, Complex b)
    {
        Complex thuong = new Complex(0,0);
        thuong.realPart = (a.realPart * b.realPart + a.imaginaryPart*b.imaginaryPart) / (b.realPart * b.realPart + b.imaginaryPart * b.imaginaryPart);
        thuong.imaginaryPart = (a.imaginaryPart*b.realPart-a.realPart*b.imaginaryPart) / (b.realPart * b.realPart + b.imaginaryPart * b.imaginaryPart);
        return thuong;
    }
    public static void main(String args[]) {
        Complex a = new Complex(5.5, 4);
        Complex b = new Complex(1.2, 3.5);
        Complex tong = sum(a, b);
        Complex hieu = subtract(a, b);
        Complex tich = multiply(a,b);
        Complex thuong = divide(a,b);
        System.out.printf("Sum is: "+ tong.realPart+" + "+ tong.imaginaryPart +"i"+"\n");
        System.out.printf("Difference is: "+ hieu.realPart+" + "+ hieu.imaginaryPart +"i"+"\n");
        System.out.printf("Multiply is: "+ tich.realPart+" + "+ tich.imaginaryPart +"i"+"\n");
        System.out.printf("Divide is: "+ thuong.realPart+" + "+ thuong.imaginaryPart +"i"+"\n");
    }
}
