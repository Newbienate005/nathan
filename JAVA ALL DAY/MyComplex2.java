class MyComplex2 {
    private double real;
    private double imag;

    public MyComplex2() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyComplex2(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public boolean isReal() {
        return imag == 0;
    }

    public boolean isImaginary() {
        return real == 0;
    }

    public boolean equals(MyComplex another) {
        return real == another.real && imag == another.imag;
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public MyComplex add(MyComplex right) {
        return new MyComplex(real + right.real, imag + right.imag);
    }

    public MyComplex subtract(MyComplex right) {
        return new MyComplex(real - right.real, imag - right.imag);
    }

    public MyComplex multiply(MyComplex right) {
        double newReal = real * right.real - imag * right.imag;
        double newImag = real * right.imag + imag * right.real;
        return new MyComplex(newReal, newImag);
    }

    public MyComplex divide(MyComplex right) {
        double denominator = right.real * right.real + right.imag * right.imag;
        double newReal = (real * right.real + imag * right.imag) / denominator;
        double newImag = (imag * right.real - real * right.imag) / denominator;
        return new MyComplex(newReal, newImag);
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(real + right.real, imag + right.imag);
    }

    public MyComplex2 conjugate() {
        return new MyComplex2(real, -imag);
    }

    @Override
    public String toString() {
        if (imag == 0) {
            return String.format("%.2f", real);
        } else if (real == 0) {
            return String.format("%.2fi", imag);
        } else {
            return String.format("%.2f+%.2fi", real, imag);
        }
    }
}