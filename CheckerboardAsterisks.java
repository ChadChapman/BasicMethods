
public class CheckerboardAsterisks {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkerBoard(5);
	}
	public static void checkerBoard(int littleN) {
		int rows;
		int columns;
		String space = " *";
		String noSpace = "* ";

		for (rows = 0; rows <= littleN; rows++) {

			for (columns = 0; columns <= littleN; columns++) {

				if (rows % 2 == 0) {
					System.out.print(space);
				} else {
					System.out.print(noSpace);
				}
			}
			System.out.println();
		}
	}
}

/*public class ProgEx3No2 {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	const int gridSize = 8;
    const string dark = "x";
    const string light = "o";

    for (var row = 0; row < gridSize; row++)
    {
        for (var col = 0; col < gridSize; col++)
        {   
            string output;
            if (row % 2 == 0)
            {
                output = (col % 2 == 0) ? dark : light;
            }
            else
            {
                output = (col % 2 == 0) ? light : dark;
            }

            Console.Write(output);  
        }
        Console.WriteLine();
    }
}
}

}
*/
