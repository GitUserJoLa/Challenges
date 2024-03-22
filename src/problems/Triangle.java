package problems;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Triangle {
    private final int side1;
    private final int side2;
    private final int side3;

    private Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        if (!isTriangle()) {
            throw new RuntimeException("plain triangle could not be created");
        }
        System.out.println("problems.Triangle has been created successfully");
    }

    Triangle(List<Integer> sides) {
         this(
                sides.get(0),
                sides.get(1),
                sides.get(2)
        );
    }

    Triangle(Integer[] sides){
        this(
                sides[0],
                sides[1],
                sides[2]
        );
    }

    private boolean isTriangle() {
        return (side1 + side2 > side3) &&
                (side1 + side3 > side2) &&
                (side2 + side3 > side1);
    }

    public static void main(String[] args) throws IOException{

        //get Console Input
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        //split input string
        String[] sidesStr = line.split(" ");
        //convert Array sidesStr to Stream, using stateless function declared in map()
        List<Integer> sides = Arrays.stream(sidesStr).map(
                //parse each element to Int
                (side) -> Integer.parseInt(side)
                //and add all results to List
        ).toList();

        Triangle triangle = new Triangle(sides);
    }
}
//On class level and on attributes level
