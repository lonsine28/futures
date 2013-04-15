package com.hundsun.futures.action;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Map;

import com.hundsun.futures.util.ImageUtil;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

public class ImageAction extends BaseAction{
  //stream Result��ȡ������ֵ���
	//���ͱ���ΪInputStream
	private InputStream imageStream;
  public String execute(){
  	Map<String,BufferedImage> map=ImageUtil.createImage();
  	//��ȡ��֤���ַ�������session
  	String code=map.keySet().iterator().next();
  	session.put("code", code);
  	//��ȡͼƬ
  	BufferedImage image=map.get(code);
  	//��image��imageStream��ֵ
  	ByteArrayOutputStream  bos=new ByteArrayOutputStream();
  	JPEGImageEncoder encoder=JPEGCodec.createJPEGEncoder(bos);
  	try {
			encoder.encode(image);
			byte[] bts=bos.toByteArray();
			imageStream=new ByteArrayInputStream(bts);
		} catch (Exception e) {
			e.printStackTrace();
		}
  	return "success";
  }
	public InputStream getImageStream() {
		return imageStream;
	}

	public void setImageStream(InputStream imageStream) {
		this.imageStream = imageStream;
	}
	
}
