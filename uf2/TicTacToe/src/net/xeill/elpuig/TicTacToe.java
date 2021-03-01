package net.xeill.elpuig;

import java.util.Scanner;

class TicTacToe {

  Scanner scanner = new Scanner(System.in);
  int[][] board = new int[3][3];
  int turn = 1;

  // Constructor con parámetros, filas, columnas
  public TicTacToe(int filas, int columnas) {
    super();
    board = new int[filas][columnas];
    init();
  }

  public TicTacToe() {
    super();
    init();
  }

  public void welcome() {
    System.out.println("-- Welcome to TicTacToe java --");
    System.out.println("-- Enjoy!! --");
  }

  // Pone todas las posiciones del tablero a cero
  public void init() {
    for (int i = 0; i < this.board.length; i++) {
      for (int j = 0; j < this.board[0].length; j++) {
        this.board[i][j] = 0;
      }
    }
  }

  public void print() {

    for (int i = 0; i < this.board.length; i++) {
      for (int j = 0; j < this.board[0].length; j++) {

        if (this.board[i][j] == 1) System.out.print("X");
        else if (this.board[i][j] == 2) System.out.print("O");
        else System.out.print("-");

        System.out.print(" ");

      }
      System.out.println();
    }

  }

  // Imprime la leyenda del tablero
  // 123
  // 456
  // 789
  public void printLegend() {

    for (int i = 0; i < this.board.length; i++) {
      for (int j = 0; j < this.board[0].length; j++) {
          System.out.print(i+" "+j+"   ");
      }
      System.out.println();
    }

  }

  public void play() {
    System.out.println("¿Dónde quieres tirar?");

    this.printLegend();
    this.print();

    int x = scanner.nextInt();
    int y = scanner.nextInt();


    if (doPlay(x,y, turn)) { // He podido tirar
      nextTurn();
      System.out.println("La jugada se ha completado con éxito.");
    } else {  // No he podido tirar, hay que volver a pedir al mismo jugador
      System.out.println("No se ha podido completar la jugada, vuelva a intentarlo.");
    }

    this.printLegend();
    this.print();


  }

  public boolean isEmpty(int x, int y) {

    if (x >= 0 && x < this.board.length && y >= 0 && y <= this.board[0].length) {
      return (this.board[x][y] == 0);
    } else {
      return false;
    }


  }

  // Turn será 1 o 2 (representando al jugador 1 o al jogador 2)
  public boolean doPlay(int x, int y, int turn) {
    if (isEmpty(x, y)) {
      board[x][y] = turn;
      return true;
    } else {
      return false;
    }
  }

  public void nextTurn() {
    if (this.turn == 1) this.turn = 2;
    else this.turn = 1;
  }

  public void informacionTirada() {
      System.out.println("Es el turno del jugador "+((turn == 1) ? "X" : "O"));
  }


}
