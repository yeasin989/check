Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.yeasin989:OurServers:1.0'
	}
	
	// import 
	import com.facebook.ads.Ads;
	
	
	
	Step 3. Android Get Mathod
	
	// Your Api Add here
         Ads.fetchData(SplashActivity.this, "cxzvadgzbydhlwc", new Ads.ApiResponseListener() {
                        @Override
                        public void onSuccess(String result) {

                            Const.SERVERS=result;
                            setSingleServer();
                            Toast.makeText(SplashActivity.this, result, Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                            startActivity(intent);
                            finish();
                        }

                        @Override
                        public void onError(String errorMessage) {
                            Const.SERVERS="Error: " + errorMessage;
                        }
                    });

	
	
	Thank you
