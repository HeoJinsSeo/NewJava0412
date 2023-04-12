package com.instagram;

public class Feed {

	String id;       //필수
	int like;      // 0으로 초기화
	private long hit;	   // 0으로 초기화	
	String content;
	String[] images;  //필수  //이미지
	String[] replys;  //댓글
	String[] hashTag;
	
	// id와 images가 없이 생성 불가능
	Feed(String id, String[] images){
		// 필드의 id값에 전달인자 id를 대입
		this.id = id;
		this.images = images;
	}

	public String getId() {
		return id;
	}
	// 전달인자
	public void setId(String id) {
		if(id != null) {
		this.id = id;
		}
		// return 생략가능
		return;
	}
	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public long getHit() {
		return hit;
	}

	public void setHit(long hit) {
		if(hit>0) {
			this.hit =hit;
	}
		}
	public String getContent() {
		return content;
	}
		public void setContent(String content) {
		this.content = content;
	}

	public String[] getImages() {
		return images;
	}

	public void setImages(String[] images) {
		this.images = images;
	}

	public String[] getReplys() {
		return replys;
	}

	public void setReplys(String[] replys) {
		this.replys = replys;
	}

	public String[] getHashTag() {
		return hashTag;
	}

	public void setHashTag(String[] hashTag) {
		this.hashTag = hashTag;
	}
	
	
	
	
}
