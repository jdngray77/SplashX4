package Maps;

public class Map2 {
	
		public final int MapY = 39, MapX = 9, MapPart = 1;
		public static final String MapName = "Intro";
		
		public static int CharStartX = 5, CharStartY = 5; 
		public static String[][] DefaultCharSet = new String[50][50], ActiveCharSet = new String[50][50], ItemSet = new String[50][50], ExitSet = new String[50][50], SignSet = new String[50][50];
		
		public Map2() {
			//LINE 1
			DefaultCharSet[0][0] = "Grass2";
					DefaultCharSet[0][0] = "Grass2";
			        DefaultCharSet[0][1] = "Grass2";
			        DefaultCharSet[0][2] = "Grass1";
			        DefaultCharSet[0][3] = "Grass1";
			        DefaultCharSet[0][4] = "Grass1";
			        DefaultCharSet[0][5] = "Grass1";
			        DefaultCharSet[0][6] = "Grass1";
			        DefaultCharSet[0][7] = "Grass1";
			        DefaultCharSet[0][8] = "Grass1";
			        DefaultCharSet[0][9] = "Grass1";
			        DefaultCharSet[0][10] = "Grass1";
			        DefaultCharSet[0][11] = "Grass1";
			        DefaultCharSet[0][12] = "Grass1";
			        DefaultCharSet[0][13] = "Grass1";
			        DefaultCharSet[0][14] = "Grass1";
			        DefaultCharSet[0][15] = "Grass1";
			        DefaultCharSet[0][16] = "Grass1";
			        DefaultCharSet[0][17] = "Grass1";
			        DefaultCharSet[0][18] = "Grass1";
			        DefaultCharSet[0][19] = "Grass1";
			        DefaultCharSet[0][20] = "Grass1";
			        DefaultCharSet[0][21] = "Grass1";
			        DefaultCharSet[0][22] = "Grass1";
			        DefaultCharSet[0][23] = "Grass1";
			        DefaultCharSet[0][24] = "Grass1";
			        DefaultCharSet[0][25] = "Grass1";
			        DefaultCharSet[0][26] = "Grass1";
			        DefaultCharSet[0][27] = "Grass1";
			        DefaultCharSet[0][28] = "Grass1";
			        DefaultCharSet[0][29] = "Grass1";
			        DefaultCharSet[0][30] = "Grass1";
			        DefaultCharSet[0][31] = "Grass1";
			        DefaultCharSet[0][32] = "Sand2";
			        DefaultCharSet[0][33] = "Water";
			        DefaultCharSet[0][34] = "Water";
			        DefaultCharSet[0][35] = "Water";
			        DefaultCharSet[0][36] = "Sand1";
			        DefaultCharSet[0][37] = "Grass1";
			        DefaultCharSet[0][38] = "Grass1";
			        DefaultCharSet[0][39] = "Grass1";

			        //Row 1
			        DefaultCharSet[1][0] = "Grass2";
			        DefaultCharSet[1][1] = "Grass2";
			        DefaultCharSet[1][2] = "Grass1";
			        DefaultCharSet[1][3] = "Grass1";
			        DefaultCharSet[1][4] = "Grass1";
			        DefaultCharSet[1][5] = "Grass1";
			        DefaultCharSet[1][6] = "Grass1";
			        DefaultCharSet[1][7] = "Grass1";
			        DefaultCharSet[1][8] = "Grass1";
			        DefaultCharSet[1][9] = "Grass1";
			        DefaultCharSet[1][10] = "Grass1";
			        DefaultCharSet[1][11] = "Grass1";
			        DefaultCharSet[1][12] = "Grass1";
			        DefaultCharSet[1][13] = "Grass1";
			        DefaultCharSet[1][14] = "Grass1";
			        DefaultCharSet[1][15] = "Grass1";
			        DefaultCharSet[1][16] = "Grass1";
			        DefaultCharSet[1][17] = "Grass1";
			        DefaultCharSet[1][18] = "Grass1";
			        DefaultCharSet[1][19] = "Grass2";
			        DefaultCharSet[1][20] = "Grass1";
			        DefaultCharSet[1][21] = "Grass1";
			        DefaultCharSet[1][22] = "Grass1";
			        DefaultCharSet[1][23] = "Grass2";
			        DefaultCharSet[1][24] = "Grass2";
			        DefaultCharSet[1][25] = "Grass1";
			        DefaultCharSet[1][26] = "Grass1";
			        DefaultCharSet[1][27] = "Grass1";
			        DefaultCharSet[1][28] = "Grass1";
			        DefaultCharSet[1][29] = "Grass1";
			        DefaultCharSet[1][30] = "Grass1";
			        DefaultCharSet[1][31] = "Grass1";
			        DefaultCharSet[1][32] = "Sand2";
			        DefaultCharSet[1][33] = "Water";
			        DefaultCharSet[1][34] = "Water";
			        DefaultCharSet[1][35] = "Water";
			        DefaultCharSet[1][36] = "Sand1";
			        DefaultCharSet[1][37] = "Grass1";
			        DefaultCharSet[1][38] = "Grass1";
			        DefaultCharSet[1][39] = "Grass1";

			        //Row 2
			        DefaultCharSet[2][0] = "Grass2";
			        DefaultCharSet[2][1] = "Grass2";
			        DefaultCharSet[2][2] = "Grass2";
			        DefaultCharSet[2][3] = "Grass2";
			        DefaultCharSet[2][4] = "Grass1";
			        DefaultCharSet[2][5] = "Grass1";
			        DefaultCharSet[2][6] = "Grass1";
			        DefaultCharSet[2][7] = "Grass1";
			        DefaultCharSet[2][8] = "Grass1";
			        DefaultCharSet[2][9] = "Grass1";
			        DefaultCharSet[2][10] = "Grass1";
			        DefaultCharSet[2][11] = "Grass1";
			        DefaultCharSet[2][12] = "Grass1";
			        DefaultCharSet[2][13] = "Grass1";
			        DefaultCharSet[2][14] = "Grass1";
			        DefaultCharSet[2][15] = "Grass1";
			        DefaultCharSet[2][16] = "Grass1";
			        DefaultCharSet[2][17] = "Grass1";
			        DefaultCharSet[2][18] = "Grass1";
			        DefaultCharSet[2][19] = "Grass2";
			        DefaultCharSet[2][20] = "Grass1";
			        DefaultCharSet[2][21] = "Grass2";
			        DefaultCharSet[2][22] = "Grass2";
			        DefaultCharSet[2][23] = "Grass2";
			        DefaultCharSet[2][24] = "Grass2";
			        DefaultCharSet[2][25] = "Grass2";
			        DefaultCharSet[2][26] = "Grass1";
			        DefaultCharSet[2][27] = "Grass1";
			        DefaultCharSet[2][28] = "Grass1";
			        DefaultCharSet[2][29] = "Grass1";
			        DefaultCharSet[2][30] = "Grass1";
			        DefaultCharSet[2][31] = "Sand2";
			        DefaultCharSet[2][32] = "Water";
			        DefaultCharSet[2][33] = "Water";
			        DefaultCharSet[2][34] = "Water";
			        DefaultCharSet[2][35] = "Sand1";
			        DefaultCharSet[2][36] = "Grass1";
			        DefaultCharSet[2][37] = "Grass1";
			        DefaultCharSet[2][38] = "Grass1";
			        DefaultCharSet[2][39] = "Grass1";
			        //Row 3
			        DefaultCharSet[3][0] = "Grass2";
			        DefaultCharSet[3][1] = "Grass2";
			        DefaultCharSet[3][2] = "Grass2";
			        DefaultCharSet[3][3] = "Grass2";
			        DefaultCharSet[3][4] = "Grass2";
			        DefaultCharSet[3][5] = "Grass2";
			        DefaultCharSet[3][6] = "Grass1";
			        DefaultCharSet[3][7] = "Grass1";
			        DefaultCharSet[3][8] = "Grass1";
			        DefaultCharSet[3][9] = "Grass1";
			        DefaultCharSet[3][10] = "Grass1";
			        DefaultCharSet[3][11] = "Grass1";
			        DefaultCharSet[3][12] = "Grass1";
			        DefaultCharSet[3][13] = "Grass2";
			        DefaultCharSet[3][14] = "Grass2";
			        DefaultCharSet[3][15] = "Grass2";
			        DefaultCharSet[3][16] = "Grass2";
			        DefaultCharSet[3][17] = "SavePoint";
			        DefaultCharSet[3][18] = "Grass2";
			        DefaultCharSet[3][19] = "PathExit";
			        DefaultCharSet[3][20] = "Sand2";
			        DefaultCharSet[3][21] = "Grass2";
			        DefaultCharSet[3][22] = "Grass2";
			        DefaultCharSet[3][23] = "Grass2";
			        DefaultCharSet[3][24] = "Grass2";
			        DefaultCharSet[3][25] = "Grass2";
			        DefaultCharSet[3][26] = "Grass2";
			        DefaultCharSet[3][27] = "Grass2";
			        DefaultCharSet[3][28] = "Grass2";
			        DefaultCharSet[3][29] = "Grass1";
			        DefaultCharSet[3][30] = "Grass1";
			        DefaultCharSet[3][31] = "Sand2";
			        DefaultCharSet[3][32] = "Water";
			        DefaultCharSet[3][33] = "Water";
			        DefaultCharSet[3][34] = "Water";
			        DefaultCharSet[3][35] = "Sand1";
			        DefaultCharSet[3][36] = "Grass1";
			        DefaultCharSet[3][37] = "Grass1";
			        DefaultCharSet[3][38] = "Grass1";
			        DefaultCharSet[3][39] = "Grass1";

			        //Row 4
			        DefaultCharSet[4][0] = "Grass2";
			        DefaultCharSet[4][1] = "Grass2";
			        DefaultCharSet[4][2] = "Grass2";
			        DefaultCharSet[4][3] = "Grass2";
			        DefaultCharSet[4][4] = "Grass2";
			        DefaultCharSet[4][5] = "Grass2";
			        DefaultCharSet[4][6] = "Grass1";
			        DefaultCharSet[4][7] = "Grass1";
			        DefaultCharSet[4][8] = "Grass1";
			        DefaultCharSet[4][9] = "Grass2";
			        DefaultCharSet[4][10] = "Grass1";
			        DefaultCharSet[4][11] = "Grass1";
			        DefaultCharSet[4][12] = "Grass1";
			        DefaultCharSet[4][13] = "Grass2";
			        DefaultCharSet[4][14] = "Grass2";
			        DefaultCharSet[4][15] = "Grass2";
			        DefaultCharSet[4][16] = "Grass2";
			        DefaultCharSet[4][17] = "Grass2";
			        DefaultCharSet[4][18] = "Grass2";
			        DefaultCharSet[4][19] = "PathExit";
			        DefaultCharSet[4][20] = "Sand2";
			        DefaultCharSet[4][21] = "Grass2";
			        DefaultCharSet[4][22] = "Grass2";
			        DefaultCharSet[4][23] = "Grass2";
			        DefaultCharSet[4][24] = "Grass2";
			        DefaultCharSet[4][25] = "Grass2";
			        DefaultCharSet[4][26] = "Grass2";
			        DefaultCharSet[4][27] = "Grass2";
			        DefaultCharSet[4][28] = "Grass2";
			        DefaultCharSet[4][29] = "Grass1";
			        DefaultCharSet[4][30] = "Grass2";
			        DefaultCharSet[4][31] = "Sand1";
			        DefaultCharSet[4][32] = "Water";
			        DefaultCharSet[4][33] = "Water";
			        DefaultCharSet[4][34] = "Water";
			        DefaultCharSet[4][35] = "Sand1";
			        DefaultCharSet[4][36] = "Grass2";
			        DefaultCharSet[4][37] = "Grass2";
			        DefaultCharSet[4][38] = "Grass1";
			        DefaultCharSet[4][39] = "Grass1";

			        //Row 5
			        DefaultCharSet[5][0] = "Grass2";
			        DefaultCharSet[5][1] = "Grass2";
			        DefaultCharSet[5][2] = "Grass2";
			        DefaultCharSet[5][3] = "Grass2";
			        DefaultCharSet[5][4] = "Grass2";
			        DefaultCharSet[5][5] = "Grass2";
			        DefaultCharSet[5][6] = "Grass1";
			        DefaultCharSet[5][7] = "Grass2";
			        DefaultCharSet[5][8] = "Grass2";
			        DefaultCharSet[5][9] = "Grass2";
			        DefaultCharSet[5][10] = "Grass2";
			        DefaultCharSet[5][11] = "Grass2";
			        DefaultCharSet[5][12] = "Grass2";
			        DefaultCharSet[5][13] = "Grass2";
			        DefaultCharSet[5][14] = "Grass2";
			        DefaultCharSet[5][15] = "Grass2";
			        DefaultCharSet[5][16] = "Grass1";
			        DefaultCharSet[5][17] = "Grass1";
			        DefaultCharSet[5][18] = "Grass1";
			        DefaultCharSet[5][19] = "Grass2";
			        DefaultCharSet[5][20] = "Grass1";
			        DefaultCharSet[5][21] = "Grass2";
			        DefaultCharSet[5][22] = "Grass2";
			        DefaultCharSet[5][23] = "Grass2";
			        DefaultCharSet[5][24] = "Grass2";
			        DefaultCharSet[5][25] = "Grass2";
			        DefaultCharSet[5][26] = "Grass2";
			        DefaultCharSet[5][27] = "Grass2";
			        DefaultCharSet[5][28] = "Grass2";
			        DefaultCharSet[5][29] = "Grass2";
			        DefaultCharSet[5][30] = "Sand1";
			        DefaultCharSet[5][31] = "Water";
			        DefaultCharSet[5][32] = "Water";
			        DefaultCharSet[5][33] = "Sand2";
			        DefaultCharSet[5][34] = "Sand1";
			        DefaultCharSet[5][35] = "Grass2";
			        DefaultCharSet[5][36] = "Grass2";
			        DefaultCharSet[5][37] = "Grass2";
			        DefaultCharSet[5][38] = "SavePoint";
			        DefaultCharSet[5][39] = "Grass1";

			        //Row 6
			        DefaultCharSet[6][0] = "Grass2";
			        DefaultCharSet[6][1] = "Grass2";
			        DefaultCharSet[6][2] = "Grass2";
			        DefaultCharSet[6][3] = "Grass2";
			        DefaultCharSet[6][4] = "Grass2";
			        DefaultCharSet[6][5] = "Grass1";
			        DefaultCharSet[6][6] = "Grass1";
			        DefaultCharSet[6][7] = "Grass1";
			        DefaultCharSet[6][8] = "Grass1";
			        DefaultCharSet[6][9] = "Grass1";
			        DefaultCharSet[6][10] = "Grass1";
			        DefaultCharSet[6][11] = "Grass2";
			        DefaultCharSet[6][12] = "Grass2";
			        DefaultCharSet[6][13] = "Grass2";
			        DefaultCharSet[6][14] = "Grass2";
			        DefaultCharSet[6][15] = "Grass2";
			        DefaultCharSet[6][16] = "Grass1";
			        DefaultCharSet[6][17] = "Grass1";
			        DefaultCharSet[6][18] = "Grass1";
			        DefaultCharSet[6][19] = "Grass2";
			        DefaultCharSet[6][20] = "Grass1";
			        DefaultCharSet[6][21] = "Grass1";
			        DefaultCharSet[6][22] = "Grass2";
			        DefaultCharSet[6][23] = "Grass2";
			        DefaultCharSet[6][24] = "Grass2";
			        DefaultCharSet[6][25] = "Grass2";
			        DefaultCharSet[6][26] = "Grass2";
			        DefaultCharSet[6][27] = "Grass2";
			        DefaultCharSet[6][28] = "Grass2";
			        DefaultCharSet[6][29] = "Grass2";
			        DefaultCharSet[6][30] = "Sand1";
			        DefaultCharSet[6][31] = "Water";
			        DefaultCharSet[6][32] = "Water";
			        DefaultCharSet[6][33] = "Water";
			        DefaultCharSet[6][34] = "Sand1";
			        DefaultCharSet[6][35] = "Grass2";
			        DefaultCharSet[6][36] = "Grass2";
			        DefaultCharSet[6][37] = "Grass2";
			        DefaultCharSet[6][38] = "Grass2";
			        DefaultCharSet[6][39] = "Grass2";

			        //Row 7
			        DefaultCharSet[7][0] = "Grass2";
			        DefaultCharSet[7][1] = "Grass2";
			        DefaultCharSet[7][2] = "Grass2";
			        DefaultCharSet[7][3] = "Grass2";
			        DefaultCharSet[7][4] = "Grass2";
			        DefaultCharSet[7][5] = "Grass1";
			        DefaultCharSet[7][6] = "Grass1";
			        DefaultCharSet[7][7] = "Grass1";
			        DefaultCharSet[7][8] = "Sand2";
			        DefaultCharSet[7][9] = "Grass1";
			        DefaultCharSet[7][10] = "Grass1";
			        DefaultCharSet[7][11] = "Grass1";
			        DefaultCharSet[7][12] = "Grass1";
			        DefaultCharSet[7][13] = "Grass1";
			        DefaultCharSet[7][14] = "Grass1";
			        DefaultCharSet[7][15] = "Grass1";
			        DefaultCharSet[7][16] = "Grass1";
			        DefaultCharSet[7][17] = "Grass1";
			        DefaultCharSet[7][18] = "Grass1";
			        DefaultCharSet[7][19] = "Grass1";
			        DefaultCharSet[7][20] = "Grass1";
			        DefaultCharSet[7][21] = "Grass1";
			        DefaultCharSet[7][22] = "Grass1";
			        DefaultCharSet[7][23] = "Grass2";
			        DefaultCharSet[7][24] = "Grass2";
			        DefaultCharSet[7][25] = "Grass2";
			        DefaultCharSet[7][26] = "Grass2";
			        DefaultCharSet[7][27] = "Grass2";
			        DefaultCharSet[7][28] = "Grass2";
			        DefaultCharSet[7][29] = "Sand2";
			        DefaultCharSet[7][30] = "Water";
			        DefaultCharSet[7][31] = "Water";
			        DefaultCharSet[7][32] = "Water";
			        DefaultCharSet[7][33] = "Water";
			        DefaultCharSet[7][34] = "Sand1";
			        DefaultCharSet[7][35] = "Grass2";
			        DefaultCharSet[7][36] = "Grass2";
			        DefaultCharSet[7][37] = "Grass2";
			        DefaultCharSet[7][38] = "Grass2";
			        DefaultCharSet[7][39] = "PathExit";

			        //Row 8
			        DefaultCharSet[8][0] = "Grass2";
			        DefaultCharSet[8][1] = "Grass2";
			        DefaultCharSet[8][2] = "Grass2";
			        DefaultCharSet[8][3] = "Grass2";
			        DefaultCharSet[8][4] = "Grass1";
			        DefaultCharSet[8][5] = "Grass1";
			        DefaultCharSet[8][6] = "Grass1";
			        DefaultCharSet[8][7] = "Sand1";
			        DefaultCharSet[8][8] = "Water";
			        DefaultCharSet[8][9] = "Sand1";
			        DefaultCharSet[8][10] = "Sand2";
			        DefaultCharSet[8][11] = "Sand1";
			        DefaultCharSet[8][12] = "Sand1";
			        DefaultCharSet[8][13] = "Sand2";
			        DefaultCharSet[8][14] = "Sand1";
			        DefaultCharSet[8][15] = "Sand1";
			        DefaultCharSet[8][16] = "Sand2";
			        DefaultCharSet[8][17] = "SandCactus";
			        DefaultCharSet[8][18] = "Grass1";
			        DefaultCharSet[8][19] = "Grass1";
			        DefaultCharSet[8][20] = "Grass1";
			        DefaultCharSet[8][21] = "Grass1";
			        DefaultCharSet[8][22] = "Grass1";
			        DefaultCharSet[8][23] = "Grass1";
			        DefaultCharSet[8][24] = "Grass1";
			        DefaultCharSet[8][25] = "Grass2";
			        DefaultCharSet[8][26] = "Grass2";
			        DefaultCharSet[8][27] = "Grass2";
			        DefaultCharSet[8][28] = "Sand2";
			        DefaultCharSet[8][29] = "Water";
			        DefaultCharSet[8][30] = "Water";
			        DefaultCharSet[8][31] = "Water";
			        DefaultCharSet[8][32] = "Water";
			        DefaultCharSet[8][33] = "Sand2";
			        DefaultCharSet[8][34] = "Sand1";
			        DefaultCharSet[8][35] = "Grass2";
			        DefaultCharSet[8][36] = "Grass2";
			        DefaultCharSet[8][37] = "Grass2";
			        DefaultCharSet[8][38] = "Grass2";
			        DefaultCharSet[8][39] = "PathExit";

			        //Row 9
			        DefaultCharSet[9][0] = "Grass2";
			        DefaultCharSet[9][1] = "Grass2";
			        DefaultCharSet[9][2] = "Grass2";
			        DefaultCharSet[9][3] = "Grass1";
			        DefaultCharSet[9][4] = "Grass1";
			        DefaultCharSet[9][5] = "Grass1";
			        DefaultCharSet[9][6] = "Sand1";
			        DefaultCharSet[9][7] = "SandCactus";
			        DefaultCharSet[9][8] = "Water";
			        DefaultCharSet[9][9] = "Water";
			        DefaultCharSet[9][10] = "Water";
			        DefaultCharSet[9][11] = "Water";
			        DefaultCharSet[9][12] = "Water";
			        DefaultCharSet[9][13] = "Water";
			        DefaultCharSet[9][14] = "Water";
			        DefaultCharSet[9][15] = "Water";
			        DefaultCharSet[9][16] = "Water";
			        DefaultCharSet[9][17] = "Water";
			        DefaultCharSet[9][18] = "Sand2";
			        DefaultCharSet[9][19] = "Grass1";
			        DefaultCharSet[9][20] = "Grass1";
			        DefaultCharSet[9][21] = "Grass1";
			        DefaultCharSet[9][22] = "Grass1";
			        DefaultCharSet[9][23] = "Grass1";
			        DefaultCharSet[9][24] = "Grass1";
			        DefaultCharSet[9][25] = "Grass1";
			        DefaultCharSet[9][26] = "Grass1";
			        DefaultCharSet[9][27] = "Grass1";
			        DefaultCharSet[9][28] = "Sand1";
			        DefaultCharSet[9][29] = "Water";
			        DefaultCharSet[9][30] = "Water";
			        DefaultCharSet[9][31] = "Water";
			        DefaultCharSet[9][32] = "Water";
			        DefaultCharSet[9][33] = "Sand1";
			        DefaultCharSet[9][34] = "Grass2";
			        DefaultCharSet[9][35] = "Grass2";
			        DefaultCharSet[9][36] = "Grass2";
			        DefaultCharSet[9][37] = "Grass2";
			        DefaultCharSet[9][38] = "Grass2";
			        DefaultCharSet[9][39] = "Grass2";
			        
			        //ItemSet
			        
				 ItemSet[0][2] = "TreeNew";
			        ItemSet[0][3] = "TreeNew";
			        ItemSet[0][4] = "TreeNew";
			        ItemSet[0][5] = "TreeNew";
			        ItemSet[0][6] = "TreeNew";
			        ItemSet[0][7] = "TreeNew";
			        ItemSet[0][8] = "TreeNew";
			        ItemSet[0][9] = "TreeNew";
			        ItemSet[0][10] = "TreeNew";
			        ItemSet[0][11] = "TreeNew";
			        ItemSet[0][12] = "TreeNew";
			        ItemSet[0][13] = "TreeNew";
			        ItemSet[0][14] = "TreeNew";
			        ItemSet[0][15] = "TreeNew";
			        ItemSet[0][16] = "TreeNew";
			        ItemSet[0][17] = "TreeNew";
			        ItemSet[0][18] = "TreeNew";
			        ItemSet[0][19] = "TreeNew";
			        ItemSet[0][20] = "TreeNew";
			        ItemSet[0][21] = "TreeNew";
			        ItemSet[0][22] = "TreeNew";
			        ItemSet[0][23] = "TreeNew";
			        ItemSet[0][24] = "TreeNew";
			        ItemSet[0][25] = "TreeNew";
			        ItemSet[0][26] = "TreeNew";
			        ItemSet[0][27] = "TreeNew";
			        ItemSet[0][28] = "TreeNew";
			        ItemSet[0][29] = "TreeNew";
			        ItemSet[0][30] = "TreeNew";
			        ItemSet[0][31] = "TreeNew";
			        ItemSet[0][37] = "TreeNew";
			        ItemSet[0][38] = "TreeNew";
			        ItemSet[0][39] = "TreeNew";

			        //row 1
			        ItemSet[1][2] = "TreeNew";
			        ItemSet[1][3] = "TreeNew";
			        ItemSet[1][4] = "TreeNew";
			        ItemSet[1][5] = "TreeNew";
			        ItemSet[1][6] = "TreeNew";
			        ItemSet[1][7] = "TreeNew";
			        ItemSet[1][8] = "TreeNew";
			        ItemSet[1][9] = "TreeNew";
			        ItemSet[1][10] = "TreeNew";
			        ItemSet[1][11] = "TreeNew";
			        ItemSet[1][12] = "TreeNew";
			        ItemSet[1][13] = "TreeNew";
			        ItemSet[1][14] = "TreeNew";
			        ItemSet[1][15] = "TreeNew";
			        ItemSet[1][16] = "TreeNew";
			        ItemSet[1][17] = "TreeNew";
			        ItemSet[1][18] = "TreeNew";    
			        ItemSet[1][20] = "TreeNew";
			        ItemSet[1][21] = "TreeNew";
			        ItemSet[1][22] = "TreeNew";      
			        ItemSet[1][25] = "TreeNew";
			        ItemSet[1][26] = "TreeNew";
			        ItemSet[1][27] = "TreeNew";
			        ItemSet[1][28] = "TreeNew";
			        ItemSet[1][29] = "TreeNew";
			        ItemSet[1][30] = "TreeNew";
			        ItemSet[1][31] = "TreeNew";
			        ItemSet[1][37] = "TreeNew";
			        ItemSet[1][38] = "TreeNew";
			        ItemSet[1][39] = "TreeNew";

			        //Row 2
			        ItemSet[2][4] = "TreeNew";
			        ItemSet[2][5] = "TreeNew";
			        ItemSet[2][6] = "TreeNew";
			        ItemSet[2][7] = "TreeNew";
			        ItemSet[2][8] = "TreeNew";
			        ItemSet[2][9] = "TreeNew";
			        ItemSet[2][10] = "TreeNew";
			        ItemSet[2][11] = "TreeNew";
			        ItemSet[2][12] = "TreeNew";
			        ItemSet[2][13] = "TreeNew";
			        ItemSet[2][14] = "TreeNew";
			        ItemSet[2][15] = "TreeNew";
			        ItemSet[2][16] = "TreeNew";
			        ItemSet[2][17] = "TreeNew";
			        ItemSet[2][18] = "TreeNew";
			        ItemSet[2][20] = "TreeNew";
			        ItemSet[2][26] = "TreeNew";
			        ItemSet[2][27] = "TreeNew";
			        ItemSet[2][28] = "TreeNew";
			        ItemSet[2][29] = "TreeNew";
			        ItemSet[2][30] = "TreeNew";
			        ItemSet[2][36] = "TreeNew";
			        ItemSet[2][37] = "TreeNew";
			        ItemSet[2][38] = "TreeNew";
			        ItemSet[2][39] = "TreeNew";
			        //Row 3
			       
			        ItemSet[3][6] = "TreeNew";
			        ItemSet[3][7] = "TreeNew";
			        ItemSet[3][8] = "TreeNew";
			        ItemSet[3][9] = "TreeNew";
			        ItemSet[3][10] = "TreeNew";
			        ItemSet[3][11] = "TreeNew";
			        ItemSet[3][12] = "TreeNew";
			        ItemSet[3][29] = "TreeNew";
			        ItemSet[3][30] = "TreeNew";
	                ItemSet[3][36] = "TreeNew";
			        ItemSet[3][37] = "TreeNew";
			        ItemSet[3][38] = "TreeNew";
			        ItemSet[3][39] = "TreeNew";

			        //Row 4
			        ItemSet[4][6] = "TreeNew";
			        ItemSet[4][7] = "TreeNew";
			        ItemSet[4][8] = "TreeNew";
			        ItemSet[4][10] = "TreeNew";
			        ItemSet[4][11] = "TreeNew";
			        ItemSet[4][12] = "TreeNew";
			        ItemSet[4][29] = "TreeNew";
			        ItemSet[4][38] = "TreeNew";
			        ItemSet[4][39] = "TreeNew";

			        //Row 5
			        ItemSet[5][6] = "TreeNew";
			        ItemSet[5][16] = "TreeNew";
			        ItemSet[5][17] = "TreeNew";
			        ItemSet[5][18] = "TreeNew";
			        ItemSet[5][20] = "TreeNew";
			        ItemSet[5][39] = "TreeNew";

			        //Row 6
			        ItemSet[6][5] = "TreeNew";
			        ItemSet[6][6] = "TreeNew";
			        ItemSet[6][7] = "TreeNew";
			        ItemSet[6][8] = "TreeNew";
			        ItemSet[6][9] = "TreeNew";
			        ItemSet[6][10] = "TreeNew";
			        ItemSet[6][16] = "TreeNew";
			        ItemSet[6][17] = "TreeNew";
			        ItemSet[6][18] = "TreeNew";
			         ItemSet[6][20] = "TreeNew";
			        ItemSet[6][21] = "TreeNew";

			        //Row 7
			         ItemSet[7][5] = "TreeNew";
			        ItemSet[7][6] = "TreeNew";
			        ItemSet[7][7] = "TreeNew";
			        ItemSet[7][9] = "TreeNew";
			        ItemSet[7][10] = "TreeNew";
			        ItemSet[7][11] = "TreeNew";
			        ItemSet[7][12] = "TreeNew";
			        ItemSet[7][13] = "TreeNew";
			        ItemSet[7][14] = "TreeNew";
			        ItemSet[7][15] = "TreeNew";
			        ItemSet[7][16] = "TreeNew";
			        ItemSet[7][17] = "TreeNew";
			        ItemSet[7][18] = "TreeNew";
			        ItemSet[7][19] = "TreeNew";
			        ItemSet[7][20] = "TreeNew";
			        ItemSet[7][21] = "TreeNew";
			        ItemSet[7][22] = "TreeNew";
			      
			        //Row 8
			        ItemSet[8][4] = "TreeNew";
			        ItemSet[8][5] = "TreeNew";
			        ItemSet[8][6] = "TreeNew";
			        ItemSet[8][19] = "TreeNew";
			        ItemSet[8][20] = "TreeNew";
			        ItemSet[8][21] = "TreeNew";
			        ItemSet[8][22] = "TreeNew";
			        ItemSet[8][23] = "TreeNew";
			        ItemSet[8][24] = "TreeNew";

			        //Row 9
			        ItemSet[9][3] = "TreeNew";
			        ItemSet[9][4] = "TreeNew";
			        ItemSet[9][5] = "TreeNew";
			        ItemSet[9][19] = "TreeNew";
			        ItemSet[9][20] = "TreeNew";
			        ItemSet[9][21] = "TreeNew";
			        ItemSet[9][22] = "TreeNew";
			        ItemSet[9][23] = "TreeNew";
			        ItemSet[9][24] = "TreeNew";
			        ItemSet[9][25] = "TreeNew";
			        ItemSet[9][26] = "TreeNew";
			        ItemSet[9][27] = "TreeNew";
			ActiveCharSet = DefaultCharSet;			
		}		
	
}
