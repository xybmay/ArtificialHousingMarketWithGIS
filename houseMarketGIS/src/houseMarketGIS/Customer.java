package houseMarketGIS;

import java.util.ArrayList;
import java.util.Iterator;

import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.Point;

import uchicago.src.nqpy.builtin.range;
import uchicago.src.sim.engine.DefaultGroup;
import uchicago.src.sim.util.Random;
import uchicago.src.simbuilder.base.gis.AbstractGeotoolsGISAgent;

public class Customer extends AbstractGeotoolsGISAgent
{
    private GISModel model;
    private String[] propNames = new String[0];
    private double income;
    private int id;
    private double NEAR_DIST;
    private int NEAR_FID;
    private String Name_CHN;
    private String Name_ENG;
    private int ORIG_FID;
    private double Shape_Area;
    private double Shape_Leng;
    private Point the_geom;
    private double 价格调整系;
    private int 出行便利;
    private int 医疗环境;
    private int 商业环境;
    private int 城市中心距;
    private int 已分析;
    private int 房产价格;
    private int 房产数量;
    private int 教育环境;
    private int 自然环境;
    private int 购物便利;
    
    public Customer(GISModel gismodel) {
	this();
	model = gismodel;
    }
    
    public Customer() {
	/* empty */
    }
    
    public String[] getProbedProperties() {
	return propNames;
    }
    
    public void setIncome(double d) {
	income = d;
    }
    
    public double getIncome() {
	return income;
    }
    
    public void setId(int i) {
	id = i;
    }
    
    public int getId() {
	return id;
    }
    
    public void step() {
	searchAndBuyHouse();
    }
    
    public void initialize() {
	//Random.createNormal(model.getIncome_mean(), model.getIncome_std());
	//Random.createStudentT(4);
	//income = Random.normal.nextDouble();
	 Random.createGamma(4.118,0.000588);
	 income=Random.gamma.nextDouble();
  //  income = Random.studentT.nextDouble()*10000;
	
	//System.out.println("income :  "+income);
	
	if (!(income >= (double) 0))
	    income = Math.abs(income);
	//System.out.println("income :  "+income);
    }
    
    public double rateDistaCen(House house) {
	double d;
    while_6_:
	do {
	while_5_:
	    do {
	    while_4_:
		do {
		while_3_:
		    do {
		    while_2_:
			do {
			while_1_:
			    do {
			    while_0_:
				do {
				    do {
					if (house.getDista_cen() > 1000) {
					    if (house.getDista_cen() > 3000) {
						if (house.getDista_cen()
						    > 5000) {
						    if (house.getDista_cen()
							> 7000) {
							if (house
								.getDista_cen()
							    > 9000) {
							    if ((house
								     .getDista_cen
								 ())
								> 11000) {
								if ((house
									 .getDista_cen
								     ())
								    > 13000) {
								    if ((house
									     .getDista_cen
									 ())
									> 15000) {
									if (house.getDista_cen()
									    > 17000)
									    d = 1.0;
									else
									    break while_5_;
									break while_6_;
								    }
								} else
								    break while_3_;
								break while_4_;
							    }
							} else
							    break while_1_;
							break while_2_;
						    }
						} else
						    break;
						break while_0_;
					    }
					} else {
					    d = 10.0;
					    break while_6_;
					}
					d = 9.0;
					break while_6_;
				    } while (false);
				    d = 8.0;
				    break while_6_;
				} while (false);
				d = 7.0;
				break while_6_;
			    } while (false);
			    d = 6.0;
			    break while_6_;
			} while (false);
			d = 5.0;
			break while_6_;
		    } while (false);
		    d = 4.0;
		    break while_6_;
		} while (false);
		d = 3.0;
		break while_6_;
	    } while (false);
	    d = 2.0;
	} while (false);
	return d;
    }
    
    public double rateEducaEnv(House house) {
	int i;
    while_13_:
	do {
	while_12_:
	    do {
	    while_11_:
		do {
		while_10_:
		    do {
		    while_9_:
			do {
			while_8_:
			    do {
			    while_7_:
				do {
				    do {
					if (house.getEduca_env() < 180) {
					    if (house.getEduca_env() < 150) {
						if (house.getEduca_env()
						    < 120) {
						    if (house.getEduca_env()
							< 90) {
							if (house
								.getEduca_env()
							    < 60) {
							    if ((house
								     .getEduca_env
								 ())
								< 30) {
								if ((house
									 .getEduca_env
								     ())
								    < 20) {
								    if ((house
									     .getEduca_env
									 ())
									< 10) {
									if (house.getEduca_env()
									    < 1)
									    i = 1;
									else
									    break while_12_;
									break while_13_;
								    }
								} else
								    break while_10_;
								break while_11_;
							    }
							} else
							    break while_8_;
							break while_9_;
						    }
						} else
						    break;
						break while_7_;
					    }
					} else {
					    i = 10;
					    break while_13_;
					}
					i = 9;
					break while_13_;
				    } while (false);
				    i = 8;
				    break while_13_;
				} while (false);
				i = 7;
				break while_13_;
			    } while (false);
			    i = 6;
			    break while_13_;
			} while (false);
			i = 5;
			break while_13_;
		    } while (false);
		    i = 4;
		    break while_13_;
		} while (false);
		i = 3;
		break while_13_;
	    } while (false);
	    i = 2;
	} while (false);
	return (double) i;
    }
    
    public double rateTraffFaci(House house) {
	int i;
    while_20_:
	do {
	while_19_:
	    do {
	    while_18_:
		do {
		while_17_:
		    do {
		    while_16_:
			do {
			while_15_:
			    do {
			    while_14_:
				do {
				    do {
					if (house.getTraff_faci() > 1000) {
					    if (house.getTraff_faci() > 3000) {
						if (house.getTraff_faci()
						    > 5000) {
						    if (house.getTraff_faci()
							> 7000) {
							if ((house
								 .getTraff_faci
							     ())
							    > 9000) {
							    if ((house
								     .getTraff_faci
								 ())
								> 11000) {
								if ((house
									 .getTraff_faci
								     ())
								    > 13000) {
								    if ((house
									     .getTraff_faci
									 ())
									> 15000) {
									if (house.getTraff_faci()
									    > 17000)
									    i = 1;
									else
									    break while_19_;
									break while_20_;
								    }
								} else
								    break while_17_;
								break while_18_;
							    }
							} else
							    break while_15_;
							break while_16_;
						    }
						} else
						    break;
						break while_14_;
					    }
					} else {
					    i = 10;
					    break while_20_;
					}
					i = 9;
					break while_20_;
				    } while (false);
				    i = 8;
				    break while_20_;
				} while (false);
				i = 7;
				break while_20_;
			    } while (false);
			    i = 6;
			    break while_20_;
			} while (false);
			i = 5;
			break while_20_;
		    } while (false);
		    i = 4;
		    break while_20_;
		} while (false);
		i = 3;
		break while_20_;
	    } while (false);
	    i = 2;
	} while (false);
	return (double) i;
    }
    
    public double rateMedicEnv(House house) {
	int i;
    while_27_:
	do {
	while_26_:
	    do {
	    while_25_:
		do {
		while_24_:
		    do {
		    while_23_:
			do {
			while_22_:
			    do {
			    while_21_:
				do {
				    do {
					if (house.getMedic_env() < 35) {
					    if (house.getMedic_env() < 30) {
						if (house.getMedic_env()
						    < 25) {
						    if (house.getMedic_env()
							< 20) {
							if (house
								.getMedic_env()
							    < 15) {
							    if ((house
								     .getMedic_env
								 ())
								< 10) {
								if ((house
									 .getMedic_env
								     ())
								    < 5) {
								    if ((house
									     .getMedic_env
									 ())
									< 3) {
									if (house.getMedic_env()
									    < 1)
									    i = 1;
									else
									    break while_26_;
									break while_27_;
								    }
								} else
								    break while_24_;
								break while_25_;
							    }
							} else
							    break while_22_;
							break while_23_;
						    }
						} else
						    break;
						break while_21_;
					    }
					} else {
					    i = 10;
					    break while_27_;
					}
					i = 9;
					break while_27_;
				    } while (false);
				    i = 8;
				    break while_27_;
				} while (false);
				i = 7;
				break while_27_;
			    } while (false);
			    i = 6;
			    break while_27_;
			} while (false);
			i = 5;
			break while_27_;
		    } while (false);
		    i = 4;
		    break while_27_;
		} while (false);
		i = 3;
		break while_27_;
	    } while (false);
	    i = 2;
	} while (false);
	return (double) i;
    }
    
    public double rateShoppEnv(House house) {
	int i;
    while_34_:
	do {
	while_33_:
	    do {
	    while_32_:
		do {
		while_31_:
		    do {
		    while_30_:
			do {
			while_29_:
			    do {
			    while_28_:
				do {
				    do {
					if (house.getShopp_env() < 400) {
					    if (house.getShopp_env() < 300) {
						if (house.getShopp_env()
						    < 250) {
						    if (house.getShopp_env()
							< 200) {
							if (house
								.getShopp_env()
							    < 150) {
							    if ((house
								     .getShopp_env
								 ())
								< 100) {
								if ((house
									 .getShopp_env
								     ())
								    < 50) {
								    if ((house
									     .getShopp_env
									 ())
									< 25) {
									if (house.getShopp_env()
									    < 1)
									    i = 1;
									else
									    break while_33_;
									break while_34_;
								    }
								} else
								    break while_31_;
								break while_32_;
							    }
							} else
							    break while_29_;
							break while_30_;
						    }
						} else
						    break;
						break while_28_;
					    }
					} else {
					    i = 10;
					    break while_34_;
					}
					i = 9;
					break while_34_;
				    } while (false);
				    i = 8;
				    break while_34_;
				} while (false);
				i = 7;
				break while_34_;
			    } while (false);
			    i = 6;
			    break while_34_;
			} while (false);
			i = 5;
			break while_34_;
		    } while (false);
		    i = 4;
		    break while_34_;
		} while (false);
		i = 3;
		break while_34_;
	    } while (false);
	    i = 2;
	} while (false);
	return (double) i;
    }
    
    public double rateNaturEnv(House house) {
	int i;
    while_41_:
	do {
	while_40_:
	    do {
	    while_39_:
		do {
		while_38_:
		    do {
		    while_37_:
			do {
			while_36_:
			    do {
			    while_35_:
				do {
				    do {
					if (house.getNatur_env() < 45) {
					    if (house.getNatur_env() < 40) {
						if (house.getNatur_env()
						    < 35) {
						    if (house.getNatur_env()
							< 30) {
							if (house
								.getNatur_env()
							    < 25) {
							    if ((house
								     .getNatur_env
								 ())
								< 20) {
								if ((house
									 .getNatur_env
								     ())
								    < 15) {
								    if ((house
									     .getNatur_env
									 ())
									< 10) {
									if (house.getNatur_env()
									    < 5)
									    i = 1;
									else
									    break while_40_;
									break while_41_;
								    }
								} else
								    break while_38_;
								break while_39_;
							    }
							} else
							    break while_36_;
							break while_37_;
						    }
						} else
						    break;
						break while_35_;
					    }
					} else {
					    i = 10;
					    break while_41_;
					}
					i = 9;
					break while_41_;
				    } while (false);
				    i = 8;
				    break while_41_;
				} while (false);
				i = 7;
				break while_41_;
			    } while (false);
			    i = 6;
			    break while_41_;
			} while (false);
			i = 5;
			break while_41_;
		    } while (false);
		    i = 4;
		    break while_41_;
		} while (false);
		i = 3;
		break while_41_;
	    } while (false);
	    i = 2;
	} while (false);
	return (double) i;
    }
    
    public void buyHouse() {
	/* empty */
    }
    
    public void searchAndBuyHouse() {
	ArrayList arraylist = new ArrayList();
	Iterator iterator = new range(1, 10).iterator();
	while (iterator.hasNext()) {
	    int i = ((Integer) iterator.next()).intValue();
	    DefaultGroup defaultgroup = model.getHouses();
	    House house = (House) defaultgroup.getRandomItem();
	    double d = (house.getPri_House()*100*(1-model.getFirstPaymant())
			* (model.getInterest()/12)
			* Math.pow(1 + (model.getInterest()/12),
				   (double) model.getLoanMonth())
			/ (Math.pow((double) 1 + (model.getInterest()/12),
				    (double) model.getLoanMonth())
			   - 1));
	    //System.out.println("mouth pay:  "+d  +" "+(house.getPri_House()*100));
	    if (!(d > (income * 0.5)))
		arraylist.add(house);
	}
	if (arraylist.size() != 0) {
	    double d = Random.uniform.nextDoubleFromTo(model.getAlpha(), (double) 1);
	    double d_0_
		= Random.uniform.nextDoubleFromTo((double) 0, (double) 1);
	    double d_1_
		= Random.uniform.nextDoubleFromTo((double) 0, (double) 1);
	    double d_2_
		= Random.uniform.nextDoubleFromTo((double) 0, (double) 1);
	    double d_3_
		= Random.uniform.nextDoubleFromTo((double) 0, (double) 1);
	    double d_4_
		= Random.uniform.nextDoubleFromTo((double) 0, (double) 1);
	    double d_5_ = d + d_0_ + d_1_ + d_2_ + d_3_ + d_4_;
	    boolean bool = false;
	    House house = (House) arraylist.get(0);
	    double d_6_ = rateDistaCen(house);
	    double d_7_ = rateEducaEnv(house);
	    double d_8_ = rateTraffFaci(house);
	    double d_9_ = rateMedicEnv(house);
	    double d_10_ = rateShoppEnv(house);
	    double d_11_ = rateNaturEnv(house);
	    double d_12_ = (d_6_ * d / d_5_ + d_7_ * d_0_ / d_5_
			    + d_8_ * d_1_ / d_5_ + d_9_ * d_2_ / d_5_
			    + d_10_ * d_3_ / d_5_ + d_11_ * d_4_ / d_5_);
	    for (int i = 1; i < arraylist.size(); i++) {
		House house_13_ = (House) arraylist.get(i);
		d_6_ = rateDistaCen(house_13_);
		d_7_ = rateEducaEnv(house_13_);
		d_8_ = rateTraffFaci(house_13_);
		d_9_ = rateMedicEnv(house_13_);
		d_10_ = rateShoppEnv(house_13_);
		d_11_ = rateNaturEnv(house_13_);
		double d_14_ = (d_6_ * d / d_5_ + d_7_ * d_0_ / d_5_
				+ d_8_ * d_1_ / d_5_ + d_9_ * d_2_ / d_5_
				+ d_10_ * d_3_ / d_5_ + d_11_ * d_4_ / d_5_);
		if (d_14_ / house_13_.getPri_House()
		    > d_12_ / house.getPri_House()) {
		    d_12_ = d_14_;
		    house = house_13_;
		}
	    }
	    house.setDem_House(house.getDem_House() + (double) 1);
	} else if (arraylist.size() == 0) {
	    /* empty */
	}
    }
    
    public void setNEAR_DIST(double d) {
	NEAR_DIST = d;
    }
    
    public double getNEAR_DIST() {
	return NEAR_DIST;
    }
    
    public void setNEAR_FID(int i) {
	NEAR_FID = i;
    }
    
    public int getNEAR_FID() {
	return NEAR_FID;
    }
    
    public void setName_CHN(String string) {
	Name_CHN = string;
    }
    
    public String getName_CHN() {
	return Name_CHN;
    }
    
    public void setName_ENG(String string) {
	Name_ENG = string;
    }
    
    public String getName_ENG() {
	return Name_ENG;
    }
    
    public void setORIG_FID(int i) {
	ORIG_FID = i;
    }
    
    public int getORIG_FID() {
	return ORIG_FID;
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
    
    public void setThe_geom(Point point) {
	the_geom = point;
    }
    
    public Geometry getThe_geom() {
	return the_geom;
    }
    
    public void set价格调整系(double d) {
	价格调整系 = d;
    }
    
    public double get价格调整系() {
	return 价格调整系;
    }
    
    public void set出行便利(int i) {
	出行便利 = i;
    }
    
    public int get出行便利() {
	return 出行便利;
    }
    
    public void set医疗环境(int i) {
	医疗环境 = i;
    }
    
    public int get医疗环境() {
	return 医疗环境;
    }
    
    public void set商业环境(int i) {
	商业环境 = i;
    }
    
    public int get商业环境() {
	return 商业环境;
    }
    
    public void set城市中心距(int i) {
	城市中心距 = i;
    }
    
    public int get城市中心距() {
	return 城市中心距;
    }
    
    public void set已分析(int i) {
	已分析 = i;
    }
    
    public int get已分析() {
	return 已分析;
    }
    
    public void set房产价格(int i) {
	房产价格 = i;
    }
    
    public int get房产价格() {
	return 房产价格;
    }
    
    public void set房产数量(int i) {
	房产数量 = i;
    }
    
    public int get房产数量() {
	return 房产数量;
    }
    
    public void set教育环境(int i) {
	教育环境 = i;
    }
    
    public int get教育环境() {
	return 教育环境;
    }
    
    public void set自然环境(int i) {
	自然环境 = i;
    }
    
    public int get自然环境() {
	return 自然环境;
    }
    
    public void set购物便利(int i) {
	购物便利 = i;
    }
    
    public GISModel getModel() {
		return model;
	}

	public int get购物便利() {
	return 购物便利;
    }
    
    public void setModel(GISModel gismodel) {
	model = gismodel;
    }

	public void setThe_geom(Geometry arg0) {
		// TODO Auto-generated method stub
		
	}
}
