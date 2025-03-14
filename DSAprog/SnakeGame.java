package DSAprog;
    import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	import java.util.Random;
public class SnakeGame extends JPanel implements KeyListener {
	    private final int WIDTH = 400;
	    private final int HEIGHT = 400;
	    private final int UNIT_SIZE = 20;
	    private final int DELAY = 75;
        private int[] x;
	    private int[] y;
	    private int bodyParts;
	    private int applesEaten;
	    private int appleX;
	    private int appleY;
	    private char direction;
	    private boolean running;
	    private Timer timer;
	    private Random random;

	    public SnakeGame() {
	        setPreferredSize(new Dimension(WIDTH, HEIGHT));
	        setBackground(Color.BLACK);
	        setFocusable(true);
	        requestFocus();
	        addKeyListener(this);

	        startGame();
	    }

	    private void startGame() {  
	        running = true;
	        bodyParts = 5;
	        applesEaten = 0;
	        direction = 'R';
	        x = new int[WIDTH / UNIT_SIZE];
	        y = new int[HEIGHT / UNIT_SIZE];

	        for (int i = 0; i < bodyParts; i++) {
	            x[i] = 100 - i * UNIT_SIZE;
	            y[i] = 100;
	        }

	        spawnApple();

	        timer = new Timer(DELAY, e -> {
	            move();
	            checkCollisions();
	            repaint();
	        });
	        timer.start();
	    }

	    private void spawnApple() {
	        random = new Random();
	        appleX = random.nextInt(WIDTH / UNIT_SIZE) * UNIT_SIZE;
	        appleY = random.nextInt(HEIGHT / UNIT_SIZE) * UNIT_SIZE;
	    }

	    private void move() {
	        for (int i = bodyParts; i > 0; i--) {
	            x[i] = x[i - 1];
	            y[i] = y[i - 1];
	        }

	        switch (direction) {
	            case 'U':
	                y[0] -= UNIT_SIZE;
	                break;
	            case 'D':
	                y[0] += UNIT_SIZE;
	                break;
	            case 'L':
	                x[0] -= UNIT_SIZE;
	                break;
	            case 'R':
	                x[0] += UNIT_SIZE;
	                break;
	        }
	    }

	    private void checkCollisions() {
	        // Check for apple collision
	        if (x[0] == appleX && y[0] == appleY) {
	            bodyParts++;
	            applesEaten++;
	            spawnApple();
	        }

	        // Check for wall collision
	        if (x[0] < 0 || x[0] >= WIDTH || y[0] < 0 || y[0] >= HEIGHT) {
	            running = false;
	        }

	        // Check for self collision
	        for (int i = bodyParts; i > 0; i--) {
	            if (x[0] == x[i] && y[0] == y[i]) {
	                running = false;
	            }
	        }

	        if (!running) {
	            timer.stop();
	            JOptionPane.showMessageDialog(this, "Game Over! Score: " + applesEaten);
	            System.exit(0);
	        }
	    }

	    @Override
	    public void paintComponent(Graphics g) {
	        super.paintComponent(g);

	        if (running) {
	            g.setColor(Color.RED);
	            g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

	            for (int i = 0; i < bodyParts; i++) {
	                if (i == 0) {
	                    g.setColor(Color.GREEN);
	                } else {
	                    g.setColor(Color.BLUE);
	                }
	                g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
	            }
	        }
	    }

	    @Override
	    public void keyPressed(KeyEvent e) {
	        switch (e.getKeyCode()) {
	            case KeyEvent.VK_UP:
	                if (direction != 'D') {
	                    direction = 'U';
	                }
	                break;
	            case KeyEvent.VK_DOWN:
	                if (direction != 'U') {
	                    direction = 'D';
	                }
	                break;
	            case KeyEvent.VK_LEFT:
	                if (direction != 'R') {
	                    direction = 'L';
	                }
	                break;
	            case KeyEvent.VK_RIGHT:
	                if (direction != 'L') {
	                    direction = 'R';
	                }
	                break;
	        }
	    }

	    @Override
	    public void keyReleased(KeyEvent e) {}

	    @Override
	    public void keyTyped(KeyEvent e) {}

	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Snake Game");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setContentPane(new SnakeGame());
	        frame.pack();
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
	    }
	}


