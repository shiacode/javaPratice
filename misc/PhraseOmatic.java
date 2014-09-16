public class PhraseOmatic {
	public static void main(String[] args) {
		String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
		String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
		String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency", "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};

		int oneLen = wordListOne.length;
		int twoLen = wordListTwo.length;
		int threeLen = wordListThree.length;

		int r1 = (int) (Math.random() *oneLen);
		int r2 = (int) (Math.random() *twoLen);
		int r3 = (int) (Math.random() *threeLen);

		String phase = wordListOne[r1] + " " + wordListTwo[r2] + " " + wordListThree[r3];

		System.out.println("What we need is a " + phase);
	}
}