class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int a = 4;
		System.out.println(a);
		int b = 3;
		System.out.println(b);
		int c = (a*b);
		System.out.println(c);
		int d = (a+b);
		System.out.println(d);
		int ans1;
		int ans2;
		int ans3;
		int ans4;
		ans1 = c*d%a+b;
		System.out.println(ans1);
		ans2 = ((-a)+d)%c;
		System.out.println(ans2);
		ans3 = ((a/b)*c)-d;
		System.out.println(ans3);
		ans4 = ((-a)-(-b))*(c%d)+d;
		System.out.println(ans4);
	}
}