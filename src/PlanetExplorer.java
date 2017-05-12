
// Before you commit and push write your student ID and finish time here.
// Finish time:
// Student ID:

public class PlanetExplorer {
	public int x=0;
	public int y=0;
	public String obstacles;
	public int[] explorer = {0,0};
	public char facing = 'N';
	
	public PlanetExplorer(int x, int y, String obstacles){
		
		this.x = x;
		this.y = y;
		this.obstacles = obstacles;
		
		
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use: For a 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  
		 
	 */
	}
	
	public String executeCommand(String command){
		
		char[] commandArray = command.toCharArray();
		for(int i = 0; i<commandArray.length; i++){
			if(commandArray[i] == 'f'){
				if(facing == 'N'){
					changeGridSide('f');
					explorer[1]++;
				}else if(facing =='S'){
					changeGridSide('f');
					explorer[1]--;
				}else if(facing == 'W'){
					changeGridSide('f');
					explorer[0]++;
				}else if(facing == 'E'){
					changeGridSide('f');
					explorer[0]--;
				}
			}else if(commandArray[i] == 'b'){
				if(facing == 'N'){
					changeGridSide('b');
					explorer[1]--;
				}else if(facing =='S'){
					changeGridSide('b');
					explorer[1]++;
				}else if(facing == 'W'){
					changeGridSide('b');
					explorer[0]--;
				}else if(facing == 'E'){
					changeGridSide('b');
					explorer[0]++;
				}
			}
			else if(commandArray[i] == 'l'){
				changeFacing('l');
			}
			else if(commandArray[i] == 'r'){
				changeFacing('r');
			}
		}
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		return explorer[0]+", "+explorer[1]+", "+ facing;
	}
	
	/*public String getObstacles(String obstacles){
		
		String helpReplace = obstacles.replace("(","");
		String helpReplace1 = helpReplace.replace(",","");
		String helpReplace2 = helpReplace1.replace(")","");
		char[] replacer = helpReplace2.toCharArray();
		int[] coordinatesOfObstacles=new int[replacer.length];
		for(int i=0;i<replacer.length;i++){
			coordinatesOfObstacles[i] = Integer.parseInt(String.valueOf(replacer[i]));
			
		}
	}*/
	
	public char changeFacing(char changeDirection){
		if(changeDirection == 'r'){
			if(facing == 'N')
				return facing = 'W';
			else if(facing == 'W')
				return facing = 'S';
			else if(facing == 'S')
				return facing = 'E';
			else if(facing == 'E')
				return facing = 'N';
		}
		else if(changeDirection == 'l'){
			if(facing == 'N')
				return facing = 'E';
			else if(facing == 'E')
				return facing = 'S';
			else if(facing == 'S')
				return facing = 'W';
			else if(facing == 'W')
				return facing = 'N';
		}
		return facing;
	}
	
	public void changeGridSide(char command){
		if((command == 'f' && facing == 'N')){
			if(explorer[1] == 100)
				explorer[1] = 0;
			
		}else if((command == 'f' && facing == 'S')){
			if(explorer[1] == 0)
				explorer[1] = 100;
		}else if(command=='f' && facing == 'W'){
			if(explorer[0] == 100)
				explorer[0] = 0;
		}else if(command=='f' && facing == 'E'){
			if(explorer[0] == 0)
				explorer[0] = 100;
		}else if(command=='b' && facing == 'N'){
			if(explorer[1] == 0)
				explorer[1] = 100;
		}else if(command=='b' && facing == 'S'){
			if(explorer[1] == 100)
				explorer[1] = 0;
		}else if(command=='b' && facing == 'W'){
			if(explorer[0] == 0)
				explorer[0] = 100;
		}
		else if(command=='b' && facing == 'E'){
			if(explorer[0] == 100)
				explorer[0] = 0;
		}
	}
}
