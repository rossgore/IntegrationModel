import java.util.ArrayList;


public class Model {
	
		// social network
		private SocialNetwork sn; 

		public int NUM_OF_AGENTS = 500;

		public int MAX_TIME = 1000;
		private int time = 1;
		
		private ArrayList<Agent> agentList;

		String outputFilename = "";
		StringBuffer modelState;
		
		public static SocialNetwork getRandomSocialNetwork(int pNumOfAgents)
		{
			String sw_type = "Random";
			double[] sw_params = {pNumOfAgents, 5.0};
			long seed = 12;
			SocialNetwork socialNetwork = new SocialNetwork(sw_type, sw_params, seed);
			String uni_weightType = "Uniform";
			double [] uni_params = {0.0, 1.0};
			socialNetwork.setWeights(uni_weightType, uni_params, seed);
			return socialNetwork;
		}

		public static SocialNetwork getDefaultSocialNetwork(int pNumOfAgents){
			String sw_type = "Small World";
			double[] sw_params = {pNumOfAgents, 2, 0.5};
			long seed = 12;
			SocialNetwork socialNetwork = new SocialNetwork(sw_type, sw_params, seed);
			String uni_weightType = "Uniform";
			double [] uni_params = {0.0, 1.0};
			socialNetwork.setWeights(uni_weightType, uni_params, seed);
			return socialNetwork;
		}

		public static SocialNetwork getPreferentialAttachmentSocialNetwork(int pNumOfAgents){
			String sw_type = "Preferential Attachment";
			double[] sw_params = {pNumOfAgents, 3.0};
			long seed = 12;
			SocialNetwork socialNetwork = new SocialNetwork(sw_type, sw_params, seed);
			String uni_weightType = "Uniform";
			double [] uni_params = {0.0, 1.0};
			socialNetwork.setWeights(uni_weightType, uni_params, seed);
			return socialNetwork;
		}

		public static SocialNetwork getEgoSocialNetwork(int pNumOfAgents){
			String sw_type = "Ego";
			double[] sw_params = {pNumOfAgents};
			long seed = 12;
			SocialNetwork socialNetwork = new SocialNetwork(sw_type, sw_params, seed);
			return socialNetwork;
		}

}
