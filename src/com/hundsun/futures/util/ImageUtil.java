package com.hundsun.futures.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ImageUtil {
private static final String[] chars={"0","1","2","3","4","5","6","7","8","9",
	"��","��","��","��","��","��","��","A","B","C","D","E","F","G","H","I","J","K","M","L","N", 
			"U","P","Q","R","S","T","W","X","Y","Z"};
private static final int SIZE=4;
private static final int LINES=20;
private static final int WIDTH=400;
private static final int HEIGHT=100;
private static final int FONT_SIZE=60;
public static Map<String,BufferedImage> createImage(){
	StringBuffer sb=new StringBuffer();
	BufferedImage imge=new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
	Graphics g=imge.getGraphics();
	g.setColor(Color.LIGHT_GRAY);
	g.fillRect(0, 0, WIDTH, HEIGHT);
	Random ran=new Random();
	//��������ַ�
	for(int i=0;i<SIZE;i++){
		int n=ran.nextInt(chars.length);
		g.setColor(getRandomColor());
		g.setFont(new Font(null,Font.BOLD+Font.ITALIC,FONT_SIZE));
		g.drawString(chars[n], i*WIDTH/SIZE, HEIGHT/2);
		sb.append(chars[n]);//���ַ����棬����Session
	}
	//��������
	for(int i=0;i<LINES;i++){
		g.setColor(getRandomColor());
		g.drawLine(ran.nextInt(WIDTH), ran.nextInt(HEIGHT), ran.nextInt(WIDTH), ran.nextInt(HEIGHT));
	}
	Map<String,BufferedImage> map=new HashMap<String,BufferedImage>();
	map.put(sb.toString(), imge);
	System.out.println(sb.toString());
	return map;
}
public static Color getRandomColor(){
	Random rad=new Random();
	Color color=new Color(rad.nextInt(256),rad.nextInt(256),rad.nextInt(256));
	return color;
}
}
