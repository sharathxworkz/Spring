package com.xworkz.television;

import org.springframework.stereotype.Component;

@Component
public class Tv {

	private String brandName;
	private String resolution;
	private Double price;
	private Remote remote;
	private SetupBox box;
	private Stand stand;
	private Display display;

	public Tv() {
		// TODO Auto-generated constructor stub
	}

	public Tv(String brandName, String resolution, Double price) {
		this.brandName = brandName;
		this.resolution = resolution;
		this.price = price;
		System.out.println(this.getClass().getSimpleName() + "Bean Created");
	}

	public Tv(SetupBox box) {
		this.box = box;
	}

	public Tv(Remote remote) {
		this.remote = remote;
	}

	public Tv(Display display) {
		this.display = display;
	}

	public Tv(Stand stand) {
		this.stand = stand;
	}

	public Tv(String brandName, String resolution, Double price, Remote remote, SetupBox box, Stand stand,
			Display display) {
		super();
		this.brandName = brandName;
		this.resolution = resolution;
		this.price = price;
		this.remote = remote;
		this.box = box;
		this.stand = stand;
		this.display = display;
	}

	@Override
	public String toString() {
		return "Tv [brandName=" + brandName + ", resolution=" + resolution + ", price=" + price + ", remote=" + remote
				+ ", box=" + box + ", stand=" + stand + ", display=" + display + "]";
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Remote getRemote() {
		return remote;
	}

	public void setRemote(Remote remote) {
		this.remote = remote;
	}

	public SetupBox getBox() {
		return box;
	}

	public void setBox(SetupBox box) {
		this.box = box;
	}

	public Stand getStand() {
		return stand;
	}

	public void setStand(Stand stand) {
		this.stand = stand;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

}
