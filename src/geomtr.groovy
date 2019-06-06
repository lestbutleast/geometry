class geomtr {
    static void main(String[] args) {
        println("What shape? 'cylinder', 'globe', 'cuboid'")
        String input
        int radius = 0
        int height = 0
        int side_a = 0
        int side_b = 0
        int side_c = 0
        input = System.in.newReader().readLine()
        if (input.contains("cylinder")) {
            println("Enter radius in centimetres")
            radius = Integer.parseInt(System.in.newReader().readLine())
            println("Enter height")
            height = Integer.parseInt(System.in.newReader().readLine())
            println("What do you want to calculate? 'volume', 'surface' ")
            input = System.in.newReader().readLine()
            if (input.contains("volume")){
                println(cylinderVol(radius, height))

            }
            else if (input.contains("surface")){
                println(cylinderSurf(radius, height))
            }
        }
        else if (input.contains("globe")){
            println("Enter radius")
            radius = Integer.parseInt(System.in.newReader().readLine())
            println("What do you want to calculate? 'scope', 'volume', 'surface' ")
            input = System.in.newReader().readLine()
            if (input.contains("scope")){
                println(globeScope(radius))

            }
            else if (input.contains("volume")){
                println(globeVol(radius))
            }
            else if (input.contains("surface")){
                println(globeSurf(radius))
            }
        }
        else if (input.contains("cuboid")){
            println("Enter a")
            side_a = Integer.parseInt(System.in.newReader().readLine())
            println("Enter b")
            side_b = Integer.parseInt(System.in.newReader().readLine())
            println("Enter c")
            side_c = Integer.parseInt(System.in.newReader().readLine())
            println("What do you want to calculate? 'volume', 'surface', 'roomdiag', 'straightness'")
            input = System.in.newReader().readLine()
            if (input.contains("volume")){
                println(cuboidVol(side_a, side_b, side_c))
            }
            else if (input.contains("surface")){
                println(cuboidSurf(side_a, side_b, side_c))
            }
            else if (input.contains("roomdiag")){
                println(cuboidRoomDiag(side_a, side_b, side_c))
            }
            else if (input.contains("straightness")){
                println(cuboidStraight(side_a, side_b, side_c))
            }
        }
    }


    public static int cylinderVol(int radius, int height) {
        return Math.PI * radius * radius * height
    }

    public static int cylinderSurf(int radius, int height) {
        return 2 * Math.PI * radius * (radius * height)
    }

    public static int globeScope(int radius) {
        return 2 * Math.PI * radius
    }

    public static double globeVol(int radius) {
        return 4 / 3 * Math.PI * Math.pow(radius, 3)
    }

    public static int globeSurf(int radius) {
        return 4 * Math.PI * radius * radius
    }

    public static int cuboidVol(int side_a, int side_b, int side_c) {
        return side_a * side_b * side_c
    }

    public static int cuboidSurf(int side_a, int side_b, int side_c) {
        return 2 * (side_a * side_b + side_b * side_c + side_a * side_c)
    }

    public static double cuboidRoomDiag(int side_a, int side_b, int side_c) {
        return Math.sqrt(side_a * side_a + side_b * side_b + side_c * side_c)
    }

    public static int cuboidStraight(int side_a, int side_b, int side_c) {
        return 4 * (side_a + side_b + side_c)
    }

}