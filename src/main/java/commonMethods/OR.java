package commonMethods;

public interface OR {

	
	//Login
	public static String username = "username >//input[@id='ttaipuser']";
	public static String password = "Password >//input[@id='ttaippass']";
	public static String userLogin = "userLogin >//button[text()='Login']";
	public static String getmessage = "Get message >//p[text()='Either user does not exist or password is wrong!']";
	
	
	// Dash Board
	public static String dashboard = "Dashboard >//ul[@id='side-menu']/li[3]/a/i";
	public static String settings = "settings >//ul[@id='side-menu']/li[5]/a/i";
	public static String assemble = "Assemble >//div[@id='page-wrapper']/div/div/nav/ul/li/div/h2";
	public static String explore = "Explore >//div[@id='page-wrapper']/div/div/nav/ul/li[2]/div/h2";
	public static String transform = "Transform >//div[@id='page-wrapper']/div/div/nav/ul/li[3]/div/h2";
	public static String model = "Model >//div[@id='page-wrapper']/div/div/nav/ul/li[4]/div/h2";
	public static String pipeline = "Pipeline >//div[@id='page-wrapper']/div[2]/div/nav/ul/li[5]/div/p";
	public static String stop = "Stop Cluster >//button[contains(text(),' Stop')]";
	public static String logout = "Logout >//*[@id='side-menu']/li[6]/a";
	
	
	// Cluster
	public static String assembleNoClusterRunning = "Upload data >//div[text()='Please make sure the cluster is running at ']";
	public static String settingsPage = "Go To Settings Page >//a[contains(text(),'settings page')]";
	public static String transformNoClusterRunning = " Start Cluster To Enable Functions >//div[text()='Please add a cluster from ']";
	public static String modelStartCluster = "Model Start Cluster >//input[@name='phone']";
	public static String pipelineStartCluster = "Pipeline Start Cluster >//input[@name='phone']";
	public static String clusterStatus = "Cluster Status >//td[text()='Spark cluster stopped']";
	public static String startCluster = "To Start Cluster >//button[@ng-disabled='disabled_start_button']";
	public static String clusterStartStatus = "Cluster Status >//td[text()='Spark cluster re-starting']";
	

	// Explore
	public static String genericData = "Generic Data >//div/div/a";
	public static String textAnalytics = "Text Analytics >//div/div[2]/a";
	public static String transformationOutput = "Transformation Output >//div[3]/a";
	public static String trainingData = "Training Data >//div[4]/a";
	public static String predectionInputs = "Predection Inputs >//div[5]/a";
	public static String predectionOutputs = "Predection Outputs >//div[6]/a";
	public static String searchfiles = "Search For Files >//input[@type='text']";
	public static String summary = "Summary >//a[contains(text(),'Summary')]";
	public static String schema = "Schema >//label[2]";
	public static String distributionSummary = "Distribution Summary >//label[3]";
	public static String coRelation = "Co-Relation >//label[4]";
	public static String Exit = "Close >//body/div[3]/div/div/div/div/a/i";
	public static String rows = "Rows >//h1";
	public static String columns = "Columns >//div[2]/div/div/h1";
	
	
	// Model
	public static String addModelUnit = "Add Model Unit >//div[@id='page-wrapper']/div[4]/div/div/div/div[2]";
	public static String trainingDataLocation = "Training Data Location >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div[2]/div/form/span/div/div/input";
	public static String decisionUnitName = "Decision Unit Name >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div[2]/div/form/span/span/div/div/input";
	public static String decisionUnitName1 = "Decision Unit Name >//label[text()='Decision Unit Name']//following::input[@ng-model='vm.obj.name']";
	public static String description = "Description >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div[2]/div/form/span/span/div[3]/div/input";
	public static String infoNextStep = "Next Step >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div[2]/div/form/span[2]/button";
	public static String dependentVariable = "Dependent Variable >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div[2]/div/form/span/div/div/select";
	public static String selectDependentVariable = "Select Dependent Variable >//option[contains(text(),'rbl_relationship_no')]";
	public static String selectDependentVariable1 = "Select Dependent Variable >//option[contains(text(),'ACTION')]";
	public static String modelNextStep = "Next Step >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div[2]/div/form/span[2]/button[2]";
	public static String analyzerType = "Analyzer Type >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div[2]/div/form/span/div/div/select";
	public static String modelClassification = "Classification-XGBoost >//option[@value='number:5']";
	public static String optimizationNextStep = "Next Step >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div[2]/div/form/span[2]/button[2]";
	public static String runModel = "Run Model >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div[2]/div/form/span[2]/button[2]";
	public static String modelError = "Error Messaage >//div[@id='toast-container']/div/div[3]/div";
	public static String featureSummary0 = "Feature Summary0 >//tr[59]/td/input";
	public static String featureSummary2 = "Feature Summary2 >//tr[63]/td/input";
	public static String featureSummary6 = "Feature Summary6 >//tr[54]/td/input";
	public static String featureSummary7 = "Feature Summary7 >//tr[55]/td/input";
	public static String featureSummary17 = "Feature Summary17 >//tr[88]/td/input";
	public static String featureSummary18 = "Feature Summary18 >//tr[89]/td/input";
	public static String featureSummary28 = "Feature Summary28 >//tr[61]/td/input";
	public static String featureSummary33 = "Feature Summary33 >//tr[46]/td/input";
	public static String featureSummary34 = "Feature Summary34 >//tr[96]/td/input";
	public static String featureSummary35 = "Feature Summary35 >//tr[95]/td/input";
	public static String featureSummary37 = "Feature Summary37 >//tr[90]/td/input";
	public static String featureSummary40 = "Feature Summary40 >//tr[57]/td/input";
	public static String featureSummary41 = "Feature Summary41 >//tr[71]/td/input";
	public static String featureSummary42 = "Feature Summary42 >//tr[58]/td/input";
	public static String featureSummary43 = "Feature Summary43 >//tr[103]/td/input";
	public static String featureSummary45 = "Feature Summary45 >//tr[104]/td/input";
	public static String featureSummary48 = "Feature Summary48 >//tr[87]/td/input";
	public static String featureSummary49 = "Feature Summary49 >//tr[86]/td/input";
	public static String featureSummary50 = "Feature Summary50 >//tr[69]/td/input";
	public static String featureSummary52 = "Feature Summary52 >//tr[64]/td/input";
	public static String featureSummary00 = "Feature Summary0 >//tr[3]/td/input";
	public static String featureSummary03 = "Feature Summary3 >//tr[10]/td/input";
	public static String featureSummary04 = "Feature Summary4 >//tr[2]/td/input";
	public static String featureSummary09 = "Feature Summary9 >//tr[8]/td/input";
	public static String categoryThreshold = "Category Threshold>//div[15]/div/input[@ng-model='vm.advObj.categoryThreshold']";
	public static String modelStatus = "Status >//tr[@ng-repeat='job in vm.jobs']//following::td[text()='RUNNING']";
	public static String viewModel = "View Model >//a[@class='btn btn-primary btn-outline btn-sm m-r']";
	public static String viewAMLModel = "View AML Model >//td/a";
	public static String viewAMLModel1 = "View AML Model >//td[text()='COMPLETED ']";
	public static String viewRBLModel = "View RBL Model >//td/a";
	public static String viewRBLModel1 = "View RBL Model >//td//i[@tooltip-trigger='mouseenter']";
	public static String viewRBLModel2 = "View RBL Model >//td[text()='Failed']//following::div[contains(text(),'Failed to run the model building pipeline')]";
	public static String evaluationMetrics = "Evaluation Metrics>//tr[@ng-repeat='job in vm.jobs']//following::td[text()='RUNNING']";
	public static String featureRelevance = "Feature Relevance>//li[2]/a/tab-heading";
	public static String decisionRules = "Decision Rules >//div/div/ul/li[3]/a";
	public static String decisionTree = "Decision Tree >//li[4]/a/tab-heading";
	public static String decisionTreeDownload = "decisionTreeDownload >//button[2]";
	public static String failedStatus = "Reason for Failure >//div[@id='page-wrapper']/div[4]/div[2]/div[3]/div/div/div[2]/table/tbody/tr/td[4]";
	public static String modelRunningStatus = "Reason for Failure >//div[@id='page-wrapper']/div[4]/div[2]/div[3]/div/div/div[2]/table/tbody/tr/td[4][text()='RUNNING']";
	
	//Scenario
	public static String viewPredection = "View Predection >//div[@id='page-wrapper']/div[2]/div/div[2]/div";
	public static String createPredection = "Create Predection >//a[contains(text(),'+ Create Prediction')]";
	public static String addDataLocation = "Data Location >//div[@id='page-wrapper']/div[2]/div[2]/div/div/div/div[2]/form/div[5]/div/input";
	public static String computemetrics = "Compute Error Metrics >//input[@type='checkbox']";
	public static String saveScenario = "Save Scenario >//button[text()='Save']";
	
	
	
	// Pipeline
	public static String viewPipeline = "View Pipeline >//a[contains(text(),'View Pipeline')]";
	public static String runAutomation = "Run Automation >//div[@id='pipeline']/div/div/div/div/div[3]/div/button";
	public static String processRunAutomation = "Select Process Run Automation >//button[@type='button']";
	public static String pipelineError = "Error Message >//div[@id='toast-container']/div/div[3]/div";
	
	
	//Transform
	public static String dataRestructuring = "Data Restructuring >//div[contains(text(),'Data Restructuring')]";
	public static String dataJoining = "Data Joining >//div[contains(text(),'Data Joining')]";
	public static String dataCleansing = "Data Cleansing >//div[contains(text(),'Data Cleansing')]";
	public static String userDefinedFunction = "User Defined Function >//div[contains(text(),'User Defined Function')]";
	public static String slide = "Slide Function >//button//b[contains(text(),'SLIDE')]";
	public static String join = "Join Function >//button//b[contains(text(),'JOIN')]";
	public static String project = "Project Function >//button//b[contains(text(),'PROJECT')]";
	public static String aggregate = "Aggregate Function >//button//b[contains(text(),'AGGREGATE')]";
	public static String transpose = "Transpose Function >//button//b[contains(text(),'TRANSPOSE')]";
	public static String encode = "Encode Function >//button//b[contains(text(),'ENCODE')]";
	public static String filter = "Filter Function >//button//b[contains(text(),'FILTER')]";
	public static String nUnion = "N_Union Function >//button//b[contains(text(),'N_UNION')]";
	public static String split = "Split Function >//button//b[contains(text(),'SPLIT')]";
	public static String balanceWithFraction = "Balance_With_Fraction Function >//button//b[contains(text(),'BALANCE_WITH_FRACTION')]";
	public static String merchantClubbingTab = "Merchant Clubbing Tab >//span[text()='Merchant Clubbing']";
	
	
	// Slide Functions
	public static String inputFile = "Input File Location >//input[@type='text']";
	public static String slideGroupByColumns = "Group By Columns  >//a//span[@id='select2-chosen-2'][text()='Choose a column']";
	public static String selectGroupByColumns = " Select Group By Columns  >//input[@id='s2id_autogen2_search']";
	public static String selectGroupByColumns1 = " Select Group By Columns  >//li//div[text()='apprefno']";
	public static String slideOrderByColumns = "Order By Columns >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div/div[2]/form/div[4]/div[2]/div/div/span";
	public static String selectOrderByColumns1 = "Order By Columns >//div[6]/a";
	public static String selectOrderByColumns = " Select Order By Columns  >//input[@placeholder='Select Column']";
	public static String afterGrouping = "Operation to run after grouping >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div/div[2]/form/div[5]/div/div/select";
	public static String selectAllRows = "Select all rows >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div/div[2]/form/div[5]/div/div/select/option[2]";
	public static String windowRangeIndex1 = "Window Index >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div/div[2]/form/div[6]/form/div[2]/div/div/div/span/input";
	public static String windowRangeIndex1True = "Absolute True >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div/div[2]/form/div[6]/form/div[2]/div/div/div/span/input[2]";
	public static String windowRangeIndex2 = "Window Range Index2 >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div/div[2]/form/div[6]/form/div[2]/div/div/div[2]/span/input";
	public static String windowRangeIndex2True = "Absolute True >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div/div[2]/form/div[6]/form/div[2]/div/div/div[2]/span/input[2]";
	public static String aggregationFunction = "Aggregation Function >	//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div/div[2]/form/div[6]/form/div[2]/div/div/div[3]/form/div/div/select";
	public static String aggregationFunctionSum = "Aggregation Function Sum >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div/div[2]/form/div[6]/form/div[2]/div/div/div[3]/form/div/div/select/option[6]";
	public static String aggregationFunctionAvg = "Aggregation Function Avg >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div/div[2]/form/div[6]/form/div[2]/div/div/div[3]/form/div/div/select/option[4]";
	public static String aggregationcolumns = "Aggregation Columns >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div/div[2]/form/div[6]/form/div[2]/div/div/div[3]/form/div/div/select//following::span";
	public static String selectAggregationcolumns = "Select Aggregation Columns >//div[text()='high_credit_amt']";
	public static String selectAggregationcolumnsAvg = "Select Aggregation Columns >//div[text()='enq_purpose']";
	public static String addOne = "Add Aggregation >//div[2]/div/a";
	public static String windowRangeIndex3 = "Window Index >//div[2]/div/span/input";
	public static String windowRangeIndex3True = "Absolute True >//div[2]/div/span/input[2]";
	public static String windowRangeIndex4 = "Window Range Index >//div[2]/div[2]/span/input";
	public static String windowRangeIndex4True = "Absolute True >//div[2]/div[2]/span/input[2]";
	public static String aggregationFunction1 = "Aggregation Function >	//div[2]/div[3]/form/div/div/select";
	public static String aggregationFunctionSum1 = "Aggregation Function Sum >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div/div[2]/form/div[6]/form/div[2]/div/div[2]/div[3]/form/div/div/select/option[6]";
	public static String aggregationFunctionColumns = "Aggregation Function Columns >//div[2]/div[3]/form/div/div[2]/div/div[2]/form/div/div/a";
	public static String aggregationFunColumns = "Aggregation Columns >//li[9]/div";
	public static String runFunction = "Run Function >//button[contains(text(),'Run Function')]";
	public static String aggregationinput = "aggregationinput >//a[@class='empty-ce ng-valid ng-dirty ng-valid-parse ng-touched']";
	public static String runningStatus = "Status >//p/span[text()='RUNNING']";
	public static String slideOutputFile = "Output File >//a[contains(text(),'SLIDE_Account_segment')]";
	public static String slideOutputFile1 = "Output File >//a[contains(text(),'SLIDE_Enquiry_Segment_')]";
	public static String inputLocation = "Input File Location >//div[2]/div/ul/li/a";
	public static String editButton = "Edit Button >//tbody//tr[2]/td[2]//following::button";

	
	// Join Functions
	public static String leftFile = "Add Input File Location(LEFT) >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div/div[2]/form/div[2]/div/input";
	public static String rightFile = "Add Input File Location(LEFT)>//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div/div[2]/form/div[3]/div/input";
	public static String leftColumnMapping = "Column Mapping Left >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div/div[2]/form/div[4]/span/form/div/div/div/div/span";
	public static String leftColumnMappinginput = "Column Mapping Left input >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div/div[2]/form/div[4]/span/form/div/div/div/input";
	public static String rightColumnMapping = "Column Mapping Right >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div/div[2]/form/div[4]/span/form/div/div[3]/div/div/span";
	public static String rightColumnMappinginput = "Column Mapping Right input >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div/div[2]/form/div[4]/span/form/div/div[3]/div/input";
	public static String typeofJoin = "Type Of Join >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div/div[2]/form/div[5]/select";
	public static String fullJoin = "FULL Join >//select//option[text()='FULL']";
	public static String columnstoLeft = " Columns To Left >//a[contains(text(),'select all')]";
	public static String columnstoRight = " Columns To Right >//div//h3[text()='Columns to be carried over from file on Right side of JOIN']//following::span//following::span";
	public static String joinOutputFile = " Output File >//tr//td//p//a[contains(text(),'JOIN_SLIDE_Account_segment_')]";
	public static String joinleft = " Columns To left >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div/div[2]/form/div[6]/span/div/div[3]/a";
	public static String joinright = " Columns To Right >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div/div[2]/form/div[7]/span/div/div[3]/a";
	public static String joincancel = "  Column >//div[7]/span/div/div/div/div/div/i[2]";
	public static String joinOutputFile1 = " Output File >//tr//td//p//a[contains(text(),'JOIN_AGGREGATE_PROJECT_JOIN_SLIDE_Account_segment_')]";
	public static String joinOutputFile2 = " Output File >//tr//td//p//a[contains(text(),'JOIN_TRANSPOSE_demogh_data_')]";
	public static String joinright1 = " Columns To Right >//div[7]/span/div/div[2]/form/div/div/a";
	public static String enterRightEncode = "  Column to Right >//div[@id='select2-drop']/div/input";
	public static String joinOutputFile3 = " Output File >//tr//td//p//a[contains(text(),'JOIN_Data2_')]";
	public static String splitType = " Split Type >//div[4]/select";
	public static String splitTypeSequential = " Split Type Sequential >//div[4]/select/option[text()='SEQUENTIAL']";
	public static String splitOutputFile = " Output File >//a[contains(text(),'SPLIT_SPLIT_intermediate_2_')]";
	
	
	// Project
	public static String addProjection = "Add Projection >//li//a[text()='Add Projection']";
	public static String selectType = "Select Type >//select[@ng-model='o.type']";
	public static String typeFunction = "Function >//select[@ng-model='o.type']//following::option[text()='Function']";
	public static String typeColumnProjection = "Column Projection>//select[@ng-model='o.type']//following::option[text()='Column Projection']";
	public static String columnName = "Column Name >//input[@ng-model='o.exp.name']";
	public static String columnType = "Column Type >//form/div/select";
	public static String columnTypeFunction = "Function >//option[@value='function']";
	public static String functionValue = "Value >//li/form/div[2]/div/div/select";
	public static String datediffFunction = "datediff Function >//option[@value='datediff']";
	public static String summaryType1 = "Type >//li[2]/form/div/select";
	public static String summaryColumn1 = "Column >//li[2]/form/div/select/option";
	public static String summaryvalue1 = "Value >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div/div[2]/form/div[3]/ul/li/form/div[2]/div[2]/ul/li/form/div[2]/div/ul/li[2]/form/div[2]/div/div/div/div/span";
	public static String enterSummaryvalue1 = "Value >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div/div[2]/form/div[3]/ul/li/form/div[2]/div[2]/ul/li/form/div[2]/div/ul/li[2]/form/div[2]/div/div/div/div/span//following::div[text()='paymt_end_dt']";
	public static String summaryType = "Type >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div/div[2]/form/div[3]/ul/li/form/div[2]/div[2]/ul/li/form/div[2]/div/ul/li/form/div/select";
	public static String summaryColumn = "Column >//div[4]/ul/li/form/div[2]/div/ul/li/form/div/select/option";
	public static String summaryvalue = "Value >//span[2]/span";
	public static String enterSummaryvalue = "Value >//span[2]/span//following::div[text()='submitteddate']";
	public static String addProjection1 = "Add Projection >//div[3]/ul/li[2]/a";
	public static String projectionType = "Select Type >//li[2]/form/div/div/select";
	public static String functionType = "Function >//li[2]/form/div/div/select//option[text()='Function']";
	public static String columnName1 = "Column Name >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div/div[2]/form/div[3]/ul/li[2]/form/div[2]/div/input";
	public static String columnType1 = "Column Type >//li[2]/form/div[2]/div[2]/ul/li/form/div/select";
	public static String columnTypeFunction1 = "Function>//li[2]/form/div[2]/div[2]/ul/li/form/div/select//following::option[@value='function']";
	public static String functionValue1 = "Value >//li[2]/form/div[2]/div[2]/ul/li/form/div[2]/div/div/select";
	public static String datediffFunction1 = "datediff Function>//li[2]/form/div[2]/div[2]/ul/li/form/div[2]/div/div/select/optgroup[2]/option[23]";
	public static String summaryType2 = "Type >//li[2]/form/div[2]/div[2]/ul/li/form/div[2]/div/ul/li/form/div/select";
	public static String summaryvalue2 = "Value >//li[2]/form/div[2]/div[2]/ul/li/form/div[2]/div/ul/li/form/div[2]/div/div/div/div/span";
	public static String enterSummaryvalue2 = "Value >//li[2]/form/div[2]/div[2]/ul/li/form/div[2]/div/ul/li/form/div[2]/div/div/div/div/span//following::div[text()='submitteddate']";
	public static String summaryType02 = "Type >//li[2]/form/div[2]/div[2]/ul/li/form/div[2]/div/ul/li[2]/form/div/select";
	public static String summaryvalue02 = "Value >//li[2]/form/div[2]/div[2]/ul/li/form/div[2]/div/ul/li[2]/form/div[2]/div/div/div/div/span";
	public static String enterSummaryvalue02 = "Value >//li[2]/form/div[2]/div[2]/ul/li/form/div[2]/div/ul/li[2]/form/div[2]/div/div/div/div/span//following::div[text()='paymt_str_dt']";
	public static String addProjection2 = "Add Projection >//div[3]/ul/li[3]/a";
	public static String projectionType2 = "Select Type >//li[3]/form/div/div/select";
	public static String functionType2 = "Function >//li[3]/form/div/div/select//option[text()='Function']";
	public static String columnName2 = "Column Name >//li[3]/form/div[2]/div/input";
	public static String columnType2 = "Column Type >//li[3]/form/div[2]/div[2]/ul/li/form/div/select";
	public static String columnTypeFunction2 = "Function>//li[3]/form/div[2]/div[2]/ul/li/form/div/select//following::option[@value='function']";
	public static String functionValue2 = "Value >//li[3]/form/div[2]/div[2]/ul/li/form/div[2]/div/div/select";
	public static String datediffFunction2 = "datediff Function>//li[3]/form/div[2]/div[2]/ul/li/form/div[2]/div/div/select/optgroup[2]/option[23]";
	public static String summaryType3 = "Type >//li[3]/form/div[2]/div[2]/ul/li/form/div[2]/div/ul/li/form/div/select";
	public static String summaryvalue3 = "Value >//li[3]/form/div[2]/div[2]/ul/li/form/div[2]/div/ul/li/form/div[2]/div/div/div/div/span";
	public static String enterSummaryvalue3 = "Value >//li[3]/form/div[2]/div[2]/ul/li/form/div[2]/div/ul/li/form/div[2]/div/div/div/div/span//following::div[text()='paymt_str_dt']";
	public static String summaryType03 = "Type >//li[3]/form/div[2]/div[2]/ul/li/form/div[2]/div/ul/li[2]/form/div/select";
	public static String summaryvalue03 = "Value >//li[3]/form/div[2]/div[2]/ul/li/form/div[2]/div/ul/li[2]/form/div[2]/div/div/div/div/span";
	public static String enterSummaryvalue03 = "Value >//li[3]/form/div[2]/div[2]/ul/li/form/div[2]/div/ul/li[2]/form/div[2]/div/div/div/div/span//following::div[text()='paymt_end_dt']";
	public static String addProjection3 = "Add Projection >//div[3]/ul/li[4]/a";
	public static String projectionType3 = "Select Type >//li[4]/form/div/div/select";
	public static String functionType3 = "Function >//li[4]/form/div/div/select//option[text()='Function']";
	public static String columnName3 = "Column Name >//li[4]/form/div[2]/div/input";
	public static String columnType3 = "Column Type >//li[4]/form/div[2]/div[2]/ul/li/form/div/select";
	public static String columnTypeFunction3 = "Function >//li[4]/form/div[2]/div[2]/ul/li/form/div/select//following::option[@value='function']";
	public static String functionValue3 = "Value >//li[4]/form/div[2]/div[2]/ul/li/form/div[2]/div/div/select";
	public static String datediffFunction3 = "datediff Function >//li[4]/form/div[2]/div[2]/ul/li/form/div[2]/div/div/select/optgroup[2]/option[23]";
	public static String summaryType4 = "Type >//li[4]/form/div[2]/div[2]/ul/li/form/div[2]/div/ul/li/form/div/select";
	public static String summaryvalue4 = "Value >//li[4]/form/div[2]/div[2]/ul/li/form/div[2]/div/ul/li/form/div[2]/div/div/div/div/span";
	public static String enterSummaryvalue4 = "Value >//li[4]/form/div[2]/div[2]/ul/li/form/div[2]/div/ul/li/form/div[2]/div/div/div/div/span//following::div[text()='last_paymt_dt']";
	public static String summaryType04 = "Type >//li[4]/form/div[2]/div[2]/ul/li/form/div[2]/div/ul/li[2]/form/div/select";
	public static String summaryvalue04 = "Value >//li[4]/form/div[2]/div[2]/ul/li/form/div[2]/div/ul/li[2]/form/div[2]/div/div/div/div/span";
	public static String enterSummaryvalue04 = "Value >//li[4]/form/div[2]/div[2]/ul/li/form/div[2]/div/ul/li[2]/form/div[2]/div/div/div/div/span//following::div[text()='opened_dt']";
	public static String addProjection4 = "Add Projection >//div[3]/ul/li[5]/a";
	public static String projectionType4 = "Select Type >//li[5]/form/div/div/select";
	public static String functionType4 = "Function >//li[5]/form/div/div/select//option[text()='Column Projection']";
	public static String columnsListProject = "List of Columns >//a[contains(text(),'select all')]";
	public static String removeListProject = "Remove Column >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div/div[2]/form/div[3]/ul/li/form/div[2]/div/div/div/div/div/div[12]/i[2]";
	public static String dateFormatColumns = "Select Column >//form/div/div/div/a";
	public static String formatColumns = "last_paymt_dt >//div[3]/div/input";
	public static String dateFormatValues = "Date Format >//form/div/div/div/a//following::div[2]/input";
	public static String dateFormatColumns1 = "Select Column >//div[2]/div/div/a";
	public static String formatColumns1 = "paymt_end_dt >//div[4]/div/input";
	public static String dateFormatValues1 = "Date Format >//div[2]/div/div/a//following::div[2]/input";
	public static String dateFormatColumns2 = "Select Column >//div[3]/div/div/a";
	public static String formatColumns2 = "submitteddate >//div[5]/div/input";
	public static String dateFormatValues2 = "Date Format >//div[3]/div/div/a//following::div[2]/input";
	public static String dateFormatColumns3 = "Select Column >//div[4]/div/div/a";
	public static String formatColumns3 = "opened_dt >//div[6]/div/input";
	public static String dateFormatValues3 = "Date Format >//div[4]/div/div/a//following::div[2]/input";
	public static String dateFormatColumns4 = "Select Column >//div[5]/div/div/a";
	public static String formatColumns4 = "paymt_str_dt >//div[7]/div/input";
	public static String dateFormatValues4 = "Date Format >//div[5]/div/div/a//following::div[2]/input";
	public static String addNewColumn = "Add New Column >//a[text()='Add a new column']";
	public static String projectOutputFile = "Output File >//tr//td//p//a[contains(text(),'PROJECT_JOIN_SLIDE_Account_segment_')]";
	public static String projectOutputFile1 = "Output File >//a[contains(text(),'PROJECT_N_UNION_N_UNION_BALANCE_intermediate_')]";
		
	
	// Aggregate Functions
	public static String aggregateFunction = "Aggregate Function >//form/div/div/select";
	public static String aggregateFunctionSum = "SUM Aggregate >//form/div/div/select//following::option[text()='SUM']";
	public static String aggregateGroupByColumns = "Group By Columns >//div/div/a/span";
	public static String selectgroupColumn = "Select Group By Column >//li[6]/div";
	public static String selectgroupColumn1 = "Select Group By Column >//div[text()='apprefno']";
	public static String columnsList = "List Of Columns >//div[2]/div/div[2]/form/div/div/a/span";
	public static String entercolumnsList = "Columns >//div[4]/div/input";
	public static String addanAggregation = "Add an Aggregation >//a[contains(text(),'Add an aggregation')]";
	public static String aggregateFunctionAvg = "AVG Aggregate >//div[2]/div/select/option[4]";
	public static String aggregateFunAvg = "Aggregate Function >//form/div[2]/div/select";
	public static String columnsList1 = "List Of Columns >//div[2]/div[2]/div/div[2]/form/div/div/a";
	public static String entercolumnsListAvg = "Aggregate Columns >//div[@id='select2-drop']/div/input";
	public static String aggregateOutputFile0 = "Aggregate Output File >//a[contains(text(),'AGGREGATE_PROJECT_JOIN_SLIDE_Account_segment_')]";
	public static String aggregateOutputFile = "Aggregate Output File >//a[contains(text(),'AGGREGATE_SLIDE_Enquiry_Segment_')]";
	

	// Transpose Function
	public static String columnsTransposed = "Columns to be Transposed >//div[@id='select2-drop']/div/input";
	public static String selectTransposeColumn = "Select Transpose Column >//div[2]/form/div/div/a";
	public static String columnsCarriedOver = "Columns To Be Carried Over >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div/div[2]/form/div[8]/span/span/div/div[3]/a";
	public static String transposeOutputFile = "Output File >//tr//td//p//a[contains(text(),'TRANSPOSE_demogh_data_')]";
	public static String close = "Close button >//i[@class='fa fa-times-circle-o']";

	
	// AML Transform
	public static String encodeOutputFile = "Output File >//tr//td//p//a[contains(text(),'ENCODE_Data2_')]";
	public static String filterColumns = "Columns To filter >//div/div/span";
	public static String SelectFilterColumns = "Select Filter Columns >//div[@id='grouped']/div/div/div/input";
	public static String filterCondition = "Condition >//div[2]/select";
	public static String selectCondition = "Select Condition >//div[2]/select//option[text()='=']";
	public static String enterCondition = "Enter Condition Value>//div[@id='grouped']/div/div[3]/input";
	public static String filterOutputFile = "Output File >//tr//td//p//a[contains(text(),'FILTER_JOIN_Data2_')]";
	public static String operation = "Select Operation >//div[3]/select";
	public static String balanceClass = "Select Balance_Class >//div[3]/select/option[@label='BALANCE_CLASS']";
	public static String selectDV = "Select Dependent Variable >//div[4]/div[2]/div/input";
	public static String selectDV1 = "Select Dependent Variable >//div[13]/a/div";
	public static String enterClassName = "Enter Class Name >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div/div[2]/form/div[5]/input";
	public static String enterFraction = "Fraction Value >//input[@type='number']";
	public static String samplingType = "Select Sampling Type >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div/div[2]/form/div[7]/select";
	public static String overSampling = "Over_Sampling >//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div/div/div[2]/form/div[7]/select/option[@label='OVER_SAMPLING']";
	public static String balanceFractionOutputFile = "Output File>//tr//td//p//a[contains(text(),'BALANCE_WITH_FRACTION_FILTER_JOIN_Data2_')]";
	public static String addFile = "Add a File >//a[contains(text(),'Add a file')]";
	public static String inputFile1 = "Second Input File >//div[2]/input";
	public static String inputFile2 = "Third Input File >//div[3]/input";
	public static String inputFile3 = "Third Input File >//div[4]/input";
	public static String nUnionOutputFile = "Output File >//a[contains(text(),'N_UNION_BALANCE_intermediate_')]";
	

	// AML Pipeline
	public static String createpipeline = "Create Pipeline >//button[1]";
	public static String addPipelineName = "Add Automation Name >//input[@placeholder='Automation Name']";
	public static String addProcess = "Add Process >//div[@id='pipeline']/div/div/div[2]/div[2]/div/a/i";
	public static String addTransformation = "Add Transformation >//a[contains(text(),'Add Transformation')]";
	public static String addModel = "Add Model >//a[contains(text(),'Add Model')]";
	public static String addScenario = "Add Scenario >//a[contains(text(),'Add Scenario')]";
	public static String chooseTransformation = "Choose a Transformation >//div[2]/div/div/div[2]/div/div[2]/div/a";
	public static String selectTransformation = "Select Transformation >//div[@id='select2-drop']/div/input";
	public static String selectFileTransformation = "Select Transformation >//ul//li//div//preceding::span[contains(text(),'JOIN_Data2_ENCODE_Data2_13186-2017-06-15T08-57-57_')]";
	public static String add = "Add >//div[3]/button";
	public static String chooseModel = "Choose Model >//div[3]/div/div[2]/div/a";
	public static String chooseAnalyzer = "Choose Analyzer >//div[3]/div[2]/div[2]/div/a";
	

	// Upload
	public static String uploadCSVFile = "Upload Terminal ID CSV File >//*[@id='page-wrapper']/div[4]/div/div[2]/div/div/div/div[1]/div/form/div[3]/div/div/input";
	public static String calculateSummary = "Calculate Summary >//*[@id='page-wrapper']/div[4]/div/div[2]/div/div/div/div[1]/div/form/div[11]/div/select";
	public static String calcutaleSummaryYes = "Calculate Summary-Yes >//*[@id='page-wrapper']/div[4]/div/div[2]/div/div/div/div[1]/div/form/div[11]/div/select/option[1]";
	public static String analyzeSave = "Path >//*[@id='page-wrapper']/div[4]/div/div[2]/div/div/div/div[1]/div/form/div[13]/div[1]/button";
	public static String uploadDate = "Upload Date >//a[contains(text(),'Example Terminal ID')]//following::tr//th[2]";
	public static String downloadFile = "Download File >//a[contains(text(),'Example Terminal ID')]//following::tr//th[3]";
	public static String Path1 = "Path 1 >//a[contains(text(),'Example Terminal ID')]//following::tbody/tr/td[1]";
	public static String uploadDate1 = "Upload Date 1 >//a[contains(text(),'Example Terminal ID')]//following::tbody/tr/td[2]";
	public static String downloadFile1 = "Download File 1 >//a[contains(text(),'Example Terminal ID')]//following::tbody/tr/td[3]/a";

	
	
}