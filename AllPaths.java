

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {{true,true,true},{true,true,true},{true,true,true}};

        allPaths("",maze,0,0);
    }
    public static void allPaths(String p,boolean[][] maze, int r, int c){
        if(!maze[r][c]){
            return;
        }
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        //down
        if(r < maze.length-1){
            if (maze[r][c]){
                maze[r][c] = false;
                allPaths(p+'D',maze,r+1,c);
                maze[r][c] = true;
            }
        }
        //right
        if(c < maze[0].length-1){
            if(maze[r][c]){
                maze[r][c]= false;
                allPaths(p+'R',maze,r,c+1);
                maze[r][c] = true;
            }
        }
        //up
        if(r < maze.length-1 && r > 0){
            if(maze[r][c]){
                maze[r][c] =  false;
                allPaths(p+'U',maze,r-1,c);
                maze[r][c] = true;
            }
        }
        //left
        if(c < maze[0].length-1 && c > 0){
           if(maze[r][c]){
               maze [r][c] = false;
               allPaths(p+'L',maze,r,c-1);
               maze[r][c] = true;
           }
        }
    }
}
