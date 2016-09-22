package houseMarketGIS;

/* GISModel decompiled from Repast Py source by Jode */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import anl.repast.gis.data.GeotoolsData;
import uchicago.src.sim.analysis.DataRecorder;
import uchicago.src.sim.analysis.OpenSequenceGraph;
import uchicago.src.sim.engine.BasicAction;
import uchicago.src.sim.engine.DefaultGroup;
import uchicago.src.sim.engine.Schedule;
import uchicago.src.sim.engine.SimInit;
import uchicago.src.simbuilder.base.gis.GISSimModelImpl;

public class GISModel extends GISSimModelImpl
{
	static int totalHouses=0;
	private double price_adjust_speed ;
    private double interest;
    private int loanMonth;
    private double income_mean;
    private double income_std;
    private OpenSequenceGraph priceMean;
    private DataRecorder price;
    private DataRecorder house1;
    private DataRecorder house2;
    private DataRecorder house3;
    private DataRecorder house4;
    private DataRecorder house5;
    private OpenSequenceGraph _demandandsupply;
    private DataRecorder demandAndSupply;
    private OpenSequenceGraph _singlePriceDynamic;
    private DefaultGroup customers;
    private DefaultGroup houses;
    private int endTime;
	private double firstPaymant;
	private double alpha;
	private double beta;
    /*synthetic*/ private static Class class$default_package$Customer;
    /*synthetic*/ private static Class class$default_package$House;
    
    /**
     * 
     */
    public GISModel() {
    	
//	params = new String[6];
//	params[0] = "price_adjust_speed";
//	params[1] = "interest";
//	params[2] = "loanMonth";
//	params[3] = "income_mean";
//	params[4] = "income_std";
//	params[5] = "endTime";
//	name = "GIS Model";
    }
    
    public String[] getInitParam() {
    	String[] params={"price_adjust_speed","interest","loanMonth","income_mean","income_std","endTime",
    			          "firstPaymant","alpha","beta"};
    	return params;
      }
    
   class RecordResult extends BasicAction {
    	private double weightedPrice;

		public void execute() {
    		FileWriter fwresult;
    		try {
    			fwresult = new FileWriter("结果.txt", true);
				BufferedWriter bwresult = new BufferedWriter(fwresult);
				PrintWriter pwresult = new PrintWriter(bwresult);
				Iterator iterator = houses.iterator();
				//System.out.println(houses.size());
//			    pwresult.print("Name_ENG");
//				pwresult.print(" ");
//				pwresult.print("PreviousPrice");
//				pwresult.print(" ");
//				pwresult.print("Demand");
//				pwresult.print(" ");
//				pwresult.print("Pri_ad_sp");
//				pwresult.print(" ");
//				pwresult.print("Dista_cen");
//				pwresult.print(" ");
//				pwresult.print("Educa_env");
//				pwresult.print(" ");
//				pwresult.print("Medic_env");
//				pwresult.print(" ");
//				pwresult.print("Natur_env");
//				pwresult.print(" ");
//				pwresult.print("Shopp_env");
//				pwresult.print(" ");
//				pwresult.print("Traff_faci");
//				pwresult.print(" ");
//				pwresult.print("interest_rate");
//				pwresult.print(" ");
//				pwresult.print("loan mouth");
//				pwresult.print(" ");
//				pwresult.print("Income_mean");
//				pwresult.print(" ");
//				pwresult.print("Income_std");
//				pwresult.print(" ");
//				pwresult.print("first payment");
//				pwresult.print(" ");
//				pwresult.print("alpha");
//				pwresult.print(" ");
//				pwresult.print("beta");
//				pwresult.print(" ");
//				pwresult.println("price_ad_speed");

				weightedPrice=weighted_price();
				while (iterator.hasNext()) {
					 House house = (House) iterator.next();
					 //pwresult.print(house.getName_ENG());
					 //pwresult.print(" ");
					 pwresult.print((int)house.getPreviousPrice());
					 pwresult.print(" ");
					 pwresult.print(house.getPreviousDemand());
					 pwresult.print(" ");
					 pwresult.print(getPrice_adjust_speed());
					 pwresult.print(" ");
					 pwresult.print(house.getDista_cen());
  					 pwresult.print(" ");
					 pwresult.print(house.getEduca_env());
					 pwresult.print(" ");
					 pwresult.print(house.getMedic_env());
					 pwresult.print(" ");
					 pwresult.print(house.getNatur_env());
					 pwresult.print(" ");
					 pwresult.print(house.getShopp_env());
					 pwresult.print(" ");
					 pwresult.print(house.getTraff_faci());
					 pwresult.print(" ");
					 pwresult.print(getInterest());
					 pwresult.print(" ");
					 pwresult.print(getLoanMonth());
					 pwresult.print(" ");
					 pwresult.print(getIncome_mean());
					 pwresult.print(" ");
					 pwresult.print(getIncome_std());
					 pwresult.print(" ");
					 pwresult.print(getFirstPaymant());
				     pwresult.print(" ");
    			         pwresult.print(getAlpha());
 					 pwresult.print(" ");
					 pwresult.print(getBeta());
					 pwresult.print(" ");
					 pwresult.print(getPrice_adjust_speed());
					 pwresult.print(" ");
					 pwresult.print(weightedPrice);
					 pwresult.println("");
					 }
				pwresult.close();
			} 
    		catch (IOException e) {
					e.printStackTrace();
				}
    	}
    }
    
    public void setPrice_adjust_speed(double f) {
	price_adjust_speed = f;
    }
    
    public double getPrice_adjust_speed() {
	return price_adjust_speed;
    }
    
    public void setInterest(double d) {
	interest = d;
    }
    
    public double getInterest() {
	return interest;
    }
    
    public void setLoanMonth(int i) {
	loanMonth = i;
    }
    
    public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}

	public int getLoanMonth() {
	return loanMonth;
    }
    
    public void setIncome_mean(double d) {
	income_mean = d;
    }
    
    public double getFirstPaymant() {
		return firstPaymant;
	}

	public void setFirstPaymant(double firstPaymant) {
		this.firstPaymant = firstPaymant;
	}

	public double getAlpha() {
		return alpha;
	}

	public void setAlpha(double alpha) {
		this.alpha = alpha;
	}

	public double getIncome_mean() {
	return income_mean;
    }
    
    public void setIncome_std(double d) {
	income_std = d;
    }
    
    public double getIncome_std() {
	return income_std;
    }
    
    public DefaultGroup getCustomers() {
	return customers;
    }
    
    public DefaultGroup getHouses() {
	return houses;
    }
    
    public double getBeta() {
		return beta;
	}

	public void setBeta(double beta) {
		this.beta = beta;
	}

	public void initAgents() {
    	Iterator iterator = customers.iterator();
    	while (iterator.hasNext()) {
    	    Customer customer = (Customer) iterator.next();
    	    customer.initialize();
    	}
    	
    	Iterator iterator_2_ = houses.iterator();
    	//System.out.println(houses.size());
    	while (iterator_2_.hasNext()) {
    	    House house = (House) iterator_2_.next();
    	    house.initialize();
    	}
    System.out.println("agent initialized!");
    System.out.println("total community:  "+ houses.size()+ "  "+GISModel.totalHouses);
    System.out.println("total buyers:  "+ customers.size());
    }
    
    public void updateDisplay() {
	this.updateGISDisplay();
    }
    
    public void writeAgents() {
	//this.writeAgents(houses, "C:\\Result\\houseAgent.shp");
    }
    
    public void _setup() {
	if (priceMean != null)
	    priceMean.dispose();
	priceMean = new OpenSequenceGraph("mean  price", this);
	this.registerMediaProducer("Sequence Graph 1", priceMean);
	
	//price_adjust_speed = Float.parseFloat("0.02");
	price_adjust_speed = 0.01;
	interest = 0.06;
	loanMonth = 360;
	income_mean = 7000.0;
	income_std = 3500.0;
	firstPaymant=0.3;
	endTime=1000;
	alpha=0.0;
	beta=5000;
	
	if (_demandandsupply != null)
	    _demandandsupply.dispose();
	_demandandsupply = new OpenSequenceGraph("demandandSupply", this);
	this.registerMediaProducer("Sequence Graph 2", _demandandsupply);
	
	
	if (_singlePriceDynamic != null)
		_singlePriceDynamic.dispose();
	_singlePriceDynamic = new OpenSequenceGraph("singlePriceDynamic", this);
	this.registerMediaProducer("Sequence Graph 3", _singlePriceDynamic);
	
	
	customers
	    = new DefaultGroup((class$default_package$Customer != null
				? class$default_package$Customer
				: (class$default_package$Customer
				   = _class$_("houseMarketGIS.Customer"))),
			       "step");
	
	houses = new DefaultGroup((class$default_package$House != null
				   ? class$default_package$House
				   : (class$default_package$House
				      = _class$_("houseMarketGIS.House"))),
				  "step");
    }
 
    /*synthetic*/ static Class _class$_(String string) {
	Class var_class;
	try {
	    var_class = Class.forName(string);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
	return var_class;
    }
    
    public void _build() {
	priceMean.createSequence("averagePrice", 3, this, "averagePrice");
	priceMean.createSequence("weighted_price", 3, this, "weighted_price");
	price = new DataRecorder("price.txt", this, "");
	price.createNumericDataSource("housePrice", this, "housePrice", -1, -1);
	price.createNumericDataSource("weighted_price", this, "weighted_price", -1,-1);
	
	_demandandsupply.createSequence("demand", this, "demand");
	_demandandsupply.createSequence("supply", this, "supply");
	demandAndSupply = new DataRecorder("demandAndSupply.txt", this, "");
	demandAndSupply.createNumericDataSource("demand", this, "demand", -1, -1);
	demandAndSupply.createNumericDataSource("supply", this, "supply", -1, -1);
	
	house1 = new DataRecorder("house1.txt", this, "");
	house1.createNumericDataSource("randomHousePrice_One", this, "randomHousePrice_One", -1,
		      -1);
	
	house2 = new DataRecorder("house2.txt", this, "");
	house2.createNumericDataSource("randomHousePrice_Two", this, "randomHousePrice_Two", -1,
		      -1);
	
	house3 = new DataRecorder("house3.txt", this, "");
	house3.createNumericDataSource("randomHousePrice_Three", this, "randomHousePrice_Three", -1,
		      -1);
	
	house4 = new DataRecorder("house4.txt", this, "");
	house4.createNumericDataSource("randomHousePrice_Four", this, "randomHousePrice_Four", -1,
		      -1);
	
	house5 = new DataRecorder("house5.txt", this, "");
	house5.createNumericDataSource("randomHousePrice_Five", this, "randomHousePrice_Five", -1,
		      -1);
	
	_singlePriceDynamic.createSequence("Center of city ", this, "randomHousePrice_One");
	_singlePriceDynamic.createSequence("2km to city center ", this, "randomHousePrice_Two");
	_singlePriceDynamic.createSequence("6km to city center ", this, "randomHousePrice_Three");
	_singlePriceDynamic.createSequence("10km to city center ", this, "randomHousePrice_Four");
	_singlePriceDynamic.createSequence("20km to city center ", this, "randomHousePrice_Five");
	
	
	GeotoolsData geotoolsdata = GeotoolsData.getInstance();
	customers.addAll(geotoolsdata.createAgents
			 ((class$default_package$Customer != null
			   ? class$default_package$Customer
			   : (class$default_package$Customer
			      = _class$_("houseMarketGIS.Customer"))),
			  "gis/agentPoint4.shp"));
	
	Iterator iterator = customers.iterator();
	while (iterator.hasNext()) {
	    Customer customer = (Customer) iterator.next();
	    customer.setModel(this);
	}
	
	geotoolsdata = GeotoolsData.getInstance();
	houses.addAll(geotoolsdata.createAgents
		      ((class$default_package$House != null
			? class$default_package$House
			: (class$default_package$House
			   = _class$_("houseMarketGIS.House"))),
		       "gis/houseAgent.shp"));
	Iterator iterator_0_ = houses.iterator();
	while (iterator_0_.hasNext()) {
	    House house = (House) iterator_0_.next();
	    house.setModel(this);
	}
	initAgents();
    }
    
    public void _display() {
	omDisplayUpdater.reset();
	esriDisplayUpdater.reset();
	updater = esriDisplayUpdater;
	priceMean.setAxisTitles("Time", "average price");
	priceMean.setXRange((double) 0, 100.0);
	priceMean.setYRange((double) 0, 10.0);
	//priceMean.display();
	_demandandsupply.setAxisTitles("Time", "demand and supply number");
	_demandandsupply.setXRange((double) 0, 100.0);
	_demandandsupply.setYRange((double) 0, 10.0);
	//_demandandsupply.display();
	_singlePriceDynamic.setAxisTitles("Time", "price");
	_singlePriceDynamic.setXRange((double) 0, 100.0);
	_singlePriceDynamic.setYRange((double) 0, 10.0);
	//_singlePriceDynamic.display();
    }
    
    public void _schedule1() {
	Iterator iterator = customers.iterator();
	while (iterator.hasNext()) {
	    Customer customer = (Customer) iterator.next();
	    customer.step();
	}
	
	Iterator iterator_1_ = houses.iterator();
	while (iterator_1_.hasNext()) {
	    House house = (House) iterator_1_.next();
	    house.step();
	}
    }
    
    public void _schedule() {
    //schedule.scheduleActionAt(0, this, "_schedule3");
    schedule.scheduleActionBeginning(1.0, this, "_schedule1");
    schedule.scheduleActionBeginning(1.0, this, "_schedule3");
	schedule.scheduleActionBeginning(1.0, this, "_schedule2");
	schedule.scheduleActionBeginning(2.0, this, "_schedule4");
	schedule.scheduleActionAt(getEndTime()-1, new RecordResult(),Schedule.LAST);
	schedule.scheduleActionAt(getEndTime(), this, "_schedule5");
	schedule.scheduleActionAt(getEndTime() , this, "stop", Schedule.LAST);
    }
    
    public void _schedule2() {
	//updateDisplay();
	//writeAgents();
//	price.setDelimeter(" ");
//    	price.record();
//	price.write();
//	house1.setDelimeter(" ");
//	house1.record();
//	house1.write();
//	house2.setDelimeter(" ");
//	house2.record();
//	house2.write();
//	house3.setDelimeter(" ");
//	house3.record();
//	house3.write();
//	house4.setDelimeter(" ");
//	house4.record();
//	house4.write();
//	house5.setDelimeter(" ");
//	house5.record();
//	house5.write();
//	
//	demandAndSupply.setDelimeter(" ");
//	demandAndSupply.record();
//	demandAndSupply.write();
    }
    
    public void _schedule4() {
      //_demandandsupply.step();
      //_singlePriceDynamic.step();
      //priceMean.step();
      //_demandandsupply.writeToFile();
     }
    
    public void _schedule5() {
        GISModel.totalHouses=0;
        //System.out.println("total houses "+GISModel.totalHouses);
       }
    
    public void _schedule3() {
     if (checkEqui())this.stop();
   }
    
    public double averagePrice() {
	int i = houses.size();
	double d = 0.0;
	Iterator iterator = houses.iterator();
	while (iterator.hasNext()) {
	    House house = (House) iterator.next();
	    double d_3_ = house.getPri_House();
	    d += d_3_;
	}
	//System.out.println(d / (double) i);
	return d / (double) i;
    }
    
    public double weighted_price() {
	double d = 0.0;
	double d_4_ = 0.0;
	Iterator iterator = houses.iterator();
	while (iterator.hasNext()) {
	    House house = (House) iterator.next();
	    d_4_ += house.getPreviousDemand() * house.getPreviousPrice();
	    d += house.getPreviousDemand();
	}
	return d_4_ / d;
    }
    
    public double housePrice() {
	int i = houses.size();
	double d = 0.0;
	Iterator iterator = houses.iterator();
	while (iterator.hasNext()) {
	    House house = (House) iterator.next();
	    double d_5_ = house.getPri_House();
	    d += d_5_;
	}
	return d / (double) i;
    }
    
    public double demand() {
	int i = houses.size();
	double d = 0.0;
	double d_6_ = 0.0;
	Iterator iterator = houses.iterator();
	while (iterator.hasNext()) {
	    House house = (House) iterator.next();
	    d_6_ += house.getPreviousDemand();
	}
	return d_6_;
    }
    
    public double supply1() {
	int i = houses.size();
	double d = 0.0;
	Iterator iterator = houses.iterator();
	while (iterator.hasNext()) {
	    House house = (House) iterator.next();
	    d += (double) house.getNum_House();
	}
	return d;
    }
    
    public double demand1() {
	int i = houses.size();
	double d = 0.0;
	double d_7_ = 0.0;
	Iterator iterator = houses.iterator();
	while (iterator.hasNext()) {
	    House house = (House) iterator.next();
	    d_7_ += house.getPreviousDemand();
	}
	return d_7_;
    }
    
    public double supply() {
	int i = houses.size();
	double d = 0.0;
	Iterator iterator = houses.iterator();
	while (iterator.hasNext()) {
	    House house = (House) iterator.next();
	    d += (double) house.getNum_House();
	}
	return d;
    }
    
    //center
    public double randomHousePrice_One() {
	int i = houses.size();
	House house = null;
	Iterator iterator = houses.iterator();
	while (iterator.hasNext()) {
	    house = (House) iterator.next();
	    if (house.getName_ENG().equals("Wenyuan Mansion")){
	    	//System.out.println("find Wenyuan Mansion");
	    	return house.getPri_House();
	    }
	}
	System.out.println("find no Wenyuan Mansion");
	return 0;
   }
    
    //3km
    public double randomHousePrice_Two() {
	int i = houses.size();
	House house = null;
	Iterator iterator = houses.iterator();
	while (iterator.hasNext()) {
	    house = (House) iterator.next();
	    if (house.getName_ENG().equals("Chengjian Multiple-use Building"))return house.getPri_House();
	}
	return 0;
   }
    
    
    //6km
    public double randomHousePrice_Three() {
    	int i = houses.size();
    	House house = null;
    	Iterator iterator = houses.iterator();
    	while (iterator.hasNext()) {
    	    house = (House) iterator.next();
    	    if (house.getName_ENG().equals("Yixin Garden"))return house.getPri_House();
    	}
    	return 0;
   }
    
    
  //10km
    public double randomHousePrice_Four() {
    	int i = houses.size();
    	House house = null;
    	Iterator iterator = houses.iterator();
    	while (iterator.hasNext()) {
    	    house = (House) iterator.next();
    	    if (house.getName_ENG().equals("Xintang Xinyizhuang"))return house.getPri_House();
    	}
    	return 0;
   }
    
    
  //20km
    public double randomHousePrice_Five() {
    	int i = houses.size();
    	House house = null;
    	Iterator iterator = houses.iterator();
    	while (iterator.hasNext()) {
    	    house = (House) iterator.next();
    	    if (house.getName_ENG().equals("Xiliyuan"))return house.getPri_House();
    	}
    	return 0;
   }
   
    public boolean checkEqui(){
    	int i = houses.size();
    	House house = null;
    	boolean reached=false;
    //	System.out.println(schedule.getCurrentTime());
    	Iterator iterator = houses.iterator();
    	while (iterator.hasNext()) {
    	    house = (House) iterator.next();
    	    if (house.getPreviousDemand()!=house.getNum_House()){
    	    //System.out.println("clear one");
    	    	return false;
    	    }
    	}
    	System.out.println("great");
    	return true;
    }
    
    public static void main(String[] strings) {
	SimInit siminit = new SimInit();
	GISModel gismodel = new GISModel();
	siminit.loadModel(gismodel, "", false);
   }
}
