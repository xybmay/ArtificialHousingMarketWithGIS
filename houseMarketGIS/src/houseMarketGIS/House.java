package houseMarketGIS;

/* House decompiled from Repast Py source by Jode */

//import java.util.Random;

import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.MultiPolygon;

import uchicago.src.sim.util.Random;
import uchicago.src.simbuilder.base.gis.AbstractGeotoolsGISAgent;


public class House extends AbstractGeotoolsGISAgent
{
    private GISModel model;
    
    private String[] propNames = new String[0];
    private double previousDemand;
    private double previousPrice;
    private String Name_ENG;
    private double Shape_Area;
    private double Shape_Leng;
    private int analyed;
    private int busin_env;
    private double dem_House;
    private int dista_cen;
    private int educa_env;
    private int medic_env;
    private int natur_env;
    private int num_House;
    private double pri_House;
    private double pri_ad_sp;
    private int shopp_env;
    private MultiPolygon the_geom;
    private int traff_faci;
    
    
    public House(GISModel gismodel) {
	this();
	model = gismodel;
	previousDemand =0;
	pri_House=0;
    }
    
    public House() {
	/* empty */
    }
    
    public String[] getProbedProperties() {
	return propNames;
    }
    
    public void setPreviousDemand(double d) {
	previousDemand = d;
    }
    
    public double getPreviousDemand() {
	return previousDemand;
    }
    
    public void setPreviousPrice(double d) {
	previousPrice = d;
    }
    
    public double getPreviousPrice() {
	return previousPrice;
    }
    
    public void step() {
	changePrice();
	previousDemand = dem_House;
	dem_House = 0.0;
    }
    
    public void changePrice() {
	double d = 1000.0;
	previousPrice = pri_House;
	pri_House = previousPrice + ((dem_House - (double) num_House)*1000*(model.getPrice_adjust_speed()));
	if (!(pri_House > d))
	    pri_House = d;
	else
	    pri_House = pri_House;
    }
    
    public void initialize() {
	num_House = (int) Math.pow(Shape_Area/10, 0.3);
	//sqrt(Math.sqrt(Shape_Area)) + 1;
	pri_House = 2.0E8 / (double) (model.getBeta() + dista_cen)-2000;
	Random.createNormal(5000, 500);
	GISModel.totalHouses+=num_House;
	//pri_House= Random.normal.nextDouble();

	//System.out.print("initial price: ");
	//System.out.print(" ");
	//System.out.println(pri_House);
    }
    
    public void preStep() {
	dem_House = 0.0;
    }
    
    public void setName_ENG(String string) {
	Name_ENG = string;
    }
    
    public String getName_ENG() {
	return Name_ENG;
    }
    
    public void setShape_Area(double d) {
	Shape_Area = d;
    }
    
    public double getShape_Area() {
	return Shape_Area;
    }
    
    public void setShape_Leng(double d) {
	Shape_Leng = d;
    }
    
    public double getShape_Leng() {
	return Shape_Leng;
    }
    
    public void setAnalyed(int i) {
	analyed = i;
    }
    
    public int getAnalyed() {
	return analyed;
    }
    
    public void setBusin_env(int i) {
	busin_env = i;
    }
    
    public int getBusin_env() {
	return busin_env;
    }
    
    public void setDem_House(double d) {
	dem_House = d;
    }
    
    public double getDem_House() {
	return dem_House;
    }
    
    public void setDista_cen(int i) {
	dista_cen = i;
    }
    
    public int getDista_cen() {
	return dista_cen;
    }
    
    public void setEduca_env(int i) {
	educa_env = i;
    }
    
    public int getEduca_env() {
	return educa_env;
    }
    
    public void setMedic_env(int i) {
	medic_env = i;
    }
    
    public int getMedic_env() {
	return medic_env;
    }
    
    public void setNatur_env(int i) {
	natur_env = i;
    }
    
    public int getNatur_env() {
	return natur_env;
    }
    
    public void setNum_House(int i) {
	num_House = i;
    }
    
    public int getNum_House() {
	return num_House;
    }
    
    public void setPri_House(double d) {
	pri_House = d;
    }
    
    public double getPri_House() {
	return pri_House;
    }
    
    public void setPri_ad_sp(double d) {
	pri_ad_sp = d;
    }
    
    public double getPri_ad_sp() {
	return pri_ad_sp;
    }
    
    public void setShopp_env(int i) {
	shopp_env = i;
    }
    
    public int getShopp_env() {
	return shopp_env;
    }
    
    public void setThe_geom(MultiPolygon multipolygon) {
	the_geom = multipolygon;
    }
    
    public Geometry getThe_geom() {
	return the_geom;
    }
    
    public void setTraff_faci(int i) {
	traff_faci = i;
    }
    
    public int getTraff_faci() {
	return traff_faci;
    }
    
    public void setModel(GISModel gismodel) {
	model = gismodel;
    }

	public void setThe_geom(Geometry arg0) {
		// TODO Auto-generated method stub
		
	}
}

