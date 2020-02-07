package com.company;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Spy;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

class squareTest {


    @Mock
    read file;
    square s;
    square s1;

    @Spy
    read file1;

    @BeforeEach
    public void setup() throws Exception {
        System.out.println("**** program started for this method ****");
        //now we mock the text file from which we read the number
        file=mock(read.class);
        s=new square();
        s.setreadobject(file);
    }

    @AfterEach
    public void setup1() {
        System.out.println("**** successfully executed the method ****");
    }

    @Test
    // we are using this test to check a normal functionality as in main function
    public void mainfunction() throws  Exception{
        square sq = new square();
        sq.setreadobject(new read());
        if (sq.isPerfectSquare())
            System.out.println("Yes");
        else
            System.out.println("No");
    }


@Test
public void changeonaccess() throws Exception {

        when(file.reader(anyString())).thenReturn(100);
        boolean answer=s.isPerfectSquare();
        verify(file).reader(anyString());
    System.out.println( verify(file).reader(anyString())); // return value of verify

}


    @Test
public void isperfectsquare() throws Exception {
        // the following 3 lines check the functionality and returns true is number is a perfect square
//boolean answer=square.isPerfectSquare();
//        assertTrue(answer);
//        System.out.println("yes it is a perfect square");


        when(file.reader(anyString())).thenReturn(100);
        boolean answer=s.isPerfectSquare();
        assertTrue(answer);
     // verify(file).reader(anyString());



    }

    @Test
    public void isinvalidperfectsquare() throws Exception {
        // the following 3 lines check the functionality and returns true is number is not a perfect square
//boolean answer=square.isPerfectSquare();
//            assertFalse(answer);
//            System.out.println("no it is not a perfect square");

        s1=new square();
        file1=spy(new read());
        s1.setreadobject(file1);

//        when(file1.reader(anyString())).thenReturn(10);  -- this does not work for spy and throws exception
doReturn(10).when(file1).reader(anyString());
        boolean answer=square.isPerfectSquare();
        assertFalse(answer);


    }
}