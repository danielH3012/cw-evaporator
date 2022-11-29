public class Evaporator { 
	
	public static int evaporator(double content, double evap_per_day, double threshold) {
    // your code
	double c = content;
    double epd = evap_per_day;
    double t = threshold;
    double bound = t/100 * c;
    double min;
    int ans = 0;
    while(c >= bound){
      min =  c * epd / 100;
      c -= min;
      ans++;
    }
      return ans;
	}
}
