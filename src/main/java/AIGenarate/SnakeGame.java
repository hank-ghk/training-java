package AIGenarate;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class SnakeGame extends JPanel implements Runnable, KeyListener {
    private static final long serialVersionUID = 1L;
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    private static final int SNAKE_SIZE = 10;
    private Thread game;
    private boolean running;
    private boolean right = true, left = false, up = false, down = false;
    private Point food;
    private LinkedList<Point> snake;
    private int snakeLength, score;
    private Random rand;
    public SnakeGame() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        addKeyListener(this);
        setFocusable(true);
        rand = new Random();
        snake = new LinkedList<Point>();
        startGame();
    }
    public void startGame() {
        running = true;
        game = new Thread(this);
        game.start();
    }
    public void stopGame() {
        running = false;
    }
    public void run() {
        snake.add(new Point(WIDTH / 2, HEIGHT / 2));
        snakeLength = 3;
        score = 0;
        food = new Point(rand.nextInt(WIDTH / SNAKE_SIZE) * SNAKE_SIZE, rand.nextInt(HEIGHT / SNAKE_SIZE) * SNAKE_SIZE);
        while (running) {
            move();
            checkCollision();
            repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void move() {
        Point head = snake.getFirst();
        int newX = head.x;
        int newY = head.y;
        if (right) {
            newX += SNAKE_SIZE;
        } else if (left) {
            newX -= SNAKE_SIZE;
        } else if (up) {
            newY -= SNAKE_SIZE;
        } else if (down) {
            newY += SNAKE_SIZE;
        }
        Point newHead = new Point(newX, newY);
        snake.addFirst(newHead);
        if (snake.size() > snakeLength) {
            snake.removeLast();
        }
    }
    public void checkCollision() {
        Point head = snake.getFirst();
        if (head.x < 0 || head.x > WIDTH - SNAKE_SIZE || head.y < 0 || head.y > HEIGHT - SNAKE_SIZE) {
            stopGame();
        }
        for (int i = 1; i < snake.size(); i++) {
            if (head.equals(snake.get(i))) {
                stopGame();
            }
        }
        if (head.equals(food)) {
            snakeLength++;
            score += 10;
            food.setLocation(rand.nextInt(WIDTH / SNAKE_SIZE) * SNAKE_SIZE, rand.nextInt(HEIGHT / SNAKE_SIZE) * SNAKE_SIZE);
        }
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // draw snake
        for (Point p : snake) {
            g.setColor(Color.GREEN);
            g.fillRect(p.x, p.y, SNAKE_SIZE, SNAKE_SIZE);
        }
        // draw food
        g.setColor(Color.RED);
        g.fillRect(food.x, food.y, SNAKE_SIZE, SNAKE_SIZE);
        // draw score
        g.setColor(Color.BLACK);
        g.drawString("Score: " + score, 10, 20);
    }
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if ((key == KeyEvent.VK_LEFT) && (!right)) {
            left = true;
            up = false;
            down = false;
        }
        if ((key == KeyEvent.VK_RIGHT) && (!left)) {
            right = true;
            up = false;
            down = false;
        }
        if ((key == KeyEvent.VK_UP) && (!down)) {
            up = true;
            right = false;
            left = false;
        }
        if ((key == KeyEvent.VK_DOWN) && (!up)) {
            down = true;
            right = false;
            left = false;
        }
    }
    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}
    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.getContentPane().add(new SnakeGame());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}