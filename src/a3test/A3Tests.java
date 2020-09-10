package a3test;
import a3.ComplexNumber;
import a3.ComplexNumberImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static java.lang.StrictMath.sqrt;


public class A3Tests {

    @Test
    // real(create(A,B)) = A;
    public void testReal() {
       ComplexNumber c = new ComplexNumberImpl(4,-9);
       assertEquals(4, c.getReal());
    }

    @Test
    //imag(create(A,B)) = B;
    public void testImag() {
        ComplexNumber c = new ComplexNumberImpl(4,-9);
        assertEquals(-9, c.getImaginary());
    }

    @Test
    //add(create(A,B), C) = A+C, B+C
    public void testAdd1() {
        int a = 3;
        int b = 1;
        ComplexNumber c = new ComplexNumberImpl(1, 3);
        ComplexNumber lhs = c.add(new ComplexNumberImpl(a, b));
        ComplexNumber rhs = new ComplexNumberImpl(a, b).add(c);
        assertEquals(lhs.getReal(), rhs.getReal());
        assertEquals(lhs.getImaginary(), rhs.getImaginary());
    }
        /*//ComplexNumber rhs = new ImmutableRationalImpl(a,b).add(c);
        // ComplexNumberImpl addAnswer = new ComplexNumberImpl(1,3);
       // assertTrue(addAnswer.equals(c.add(other)));
      //  assertEquals(c2.add(c1),c0);
        //assertEquals(4, (c).add(other));
        //assertEquals(4,c.getReal()+other.getReal());
        //assertEquals(-4,c.getImaginary()+other.getImaginary());
        // assertEquals(4,c.add(other));
       // assertEquals(c.getReal(), other.getReal());
        //assertEquals(c.getImaginary(), other.getImaginary());


    @Test
    //multiply(create(A,B), C) = ????;
    public void testMultiply1() {

    }





    @Test
    public void testAbsolute() {
        absolute(create(A,B)) = sqrt((A*A) + (B*B));
        r2.getAbsValue,
asserEquals(Math.sqrt()), getAbsValue();
                fail("Replace with testing code");
    }
    assertTrue(a.equals(b));




/*





    @Test
    public void testAdd2() {
        add(C, create(A,B)) = ????;

        fail("Replace with testing code");
    }


    @Test
    public void testMultiply2() {
        multiply(C, create(A,B)) = ????;


        fail("Replace with testing code");
    }

    @Test
    public void testEquals1() {
        equals(create(A,B), C) = ????;


        fail("Replace with testing code");
    }

    @Test
    public void testEquals2() {
        equals(C, create(A,B)) = ????;

        fail("Replace with testing code");
    }

 */
}
