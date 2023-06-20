package io.invertase.firebase.auth;

import android.app.Activity;
import android.net.Uri;
import android.os.Parcel;
import android.util.Log;
import com.applovin.sdk.AppLovinEventParameters;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.FirebaseUserMetadata;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import fm.castbox.mediation.model.NetworkName;
import io.invertase.firebase.auth.ReactNativeFirebaseAuthModule;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class ReactNativeFirebaseAuthModule extends ReactNativeFirebaseModule {
    private static final String TAG = "Auth";
    private static HashMap<String, FirebaseAuth.a> mAuthListeners = new HashMap<>();
    private static HashMap<String, FirebaseAuth.b> mIdTokenListeners = new HashMap<>();
    private PhoneAuthCredential mCredential;
    private PhoneAuthProvider.ForceResendingToken mForceResendingToken;
    private String mLastPhoneNumber;
    private String mVerificationId;

    /* loaded from: classes3.dex */
    public class a extends PhoneAuthProvider.a {

        /* renamed from: a */
        private boolean f31994a = false;

        /* renamed from: b */
        final /* synthetic */ FirebaseAuth f31995b;

        /* renamed from: c */
        final /* synthetic */ Promise f31996c;

        a(FirebaseAuth firebaseAuth, Promise promise) {
            ReactNativeFirebaseAuthModule.this = r1;
            this.f31995b = firebaseAuth;
            this.f31996c = promise;
        }

        public static /* synthetic */ void a(a aVar, PhoneAuthCredential phoneAuthCredential, Promise promise, Task task) {
            aVar.b(phoneAuthCredential, promise, task);
        }

        public /* synthetic */ void b(PhoneAuthCredential phoneAuthCredential, Promise promise, Task task) {
            if (task.isSuccessful()) {
                Log.d(ReactNativeFirebaseAuthModule.TAG, "signInWithPhoneNumber:autoVerified:signInWithCredential:onComplete:success");
                if (this.f31994a) {
                    return;
                }
                WritableMap createMap = Arguments.createMap();
                Parcel obtain = Parcel.obtain();
                phoneAuthCredential.writeToParcel(obtain, 0);
                obtain.setDataPosition(16);
                String readString = obtain.readString();
                ReactNativeFirebaseAuthModule.this.mVerificationId = readString;
                obtain.recycle();
                createMap.putString("verificationId", readString);
                promise.resolve(createMap);
                return;
            }
            Exception exception = task.getException();
            Log.e(ReactNativeFirebaseAuthModule.TAG, "signInWithPhoneNumber:autoVerified:signInWithCredential:onComplete:failure", exception);
            if (this.f31994a) {
                return;
            }
            ReactNativeFirebaseAuthModule.this.promiseRejectAuthException(promise, exception);
        }

        @Override // com.google.firebase.auth.PhoneAuthProvider.a
        public void onCodeAutoRetrievalTimeOut(String str) {
            super.onCodeAutoRetrievalTimeOut(str);
        }

        @Override // com.google.firebase.auth.PhoneAuthProvider.a
        public void onCodeSent(String str, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
            ReactNativeFirebaseAuthModule.this.mVerificationId = str;
            ReactNativeFirebaseAuthModule.this.mForceResendingToken = forceResendingToken;
            WritableMap createMap = Arguments.createMap();
            createMap.putString("verificationId", str);
            this.f31996c.resolve(createMap);
            this.f31994a = true;
        }

        @Override // com.google.firebase.auth.PhoneAuthProvider.a
        public void onVerificationCompleted(final PhoneAuthCredential phoneAuthCredential) {
            Task<AuthResult> v10 = this.f31995b.v(phoneAuthCredential);
            ExecutorService executor = ReactNativeFirebaseAuthModule.this.getExecutor();
            final Promise promise = this.f31996c;
            v10.addOnCompleteListener(executor, new OnCompleteListener() { // from class: io.invertase.firebase.auth.i0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.a.a(ReactNativeFirebaseAuthModule.a.this, phoneAuthCredential, promise, task);
                }
            });
        }

        @Override // com.google.firebase.auth.PhoneAuthProvider.a
        public void onVerificationFailed(ob.k kVar) {
            Log.d(ReactNativeFirebaseAuthModule.TAG, "signInWithPhoneNumber:verification:failed");
            ReactNativeFirebaseAuthModule.this.promiseRejectAuthException(this.f31996c, kVar);
        }
    }

    /* loaded from: classes3.dex */
    class b extends PhoneAuthProvider.a {

        /* renamed from: a */
        final /* synthetic */ String f31998a;

        /* renamed from: b */
        final /* synthetic */ String f31999b;

        b(String str, String str2) {
            ReactNativeFirebaseAuthModule.this = r1;
            this.f31998a = str;
            this.f31999b = str2;
        }

        @Override // com.google.firebase.auth.PhoneAuthProvider.a
        public void onCodeAutoRetrievalTimeOut(String str) {
            super.onCodeAutoRetrievalTimeOut(str);
            Log.d(ReactNativeFirebaseAuthModule.TAG, "verifyPhoneNumber:verification:onCodeAutoRetrievalTimeOut");
            WritableMap createMap = Arguments.createMap();
            createMap.putString("verificationId", str);
            ReactNativeFirebaseAuthModule.this.sendPhoneStateEvent(this.f31998a, this.f31999b, "onCodeAutoRetrievalTimeout", createMap);
        }

        @Override // com.google.firebase.auth.PhoneAuthProvider.a
        public void onCodeSent(String str, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
            Log.d(ReactNativeFirebaseAuthModule.TAG, "verifyPhoneNumber:verification:onCodeSent");
            ReactNativeFirebaseAuthModule.this.mForceResendingToken = forceResendingToken;
            WritableMap createMap = Arguments.createMap();
            createMap.putString("verificationId", str);
            createMap.putString("verificationId", str);
            ReactNativeFirebaseAuthModule.this.sendPhoneStateEvent(this.f31998a, this.f31999b, "onCodeSent", createMap);
        }

        @Override // com.google.firebase.auth.PhoneAuthProvider.a
        public void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
            ReactNativeFirebaseAuthModule.this.mCredential = phoneAuthCredential;
            Log.d(ReactNativeFirebaseAuthModule.TAG, "verifyPhoneNumber:verification:onVerificationCompleted");
            WritableMap createMap = Arguments.createMap();
            Parcel obtain = Parcel.obtain();
            phoneAuthCredential.writeToParcel(obtain, 0);
            obtain.setDataPosition(16);
            String readString = obtain.readString();
            obtain.setDataPosition(obtain.dataPosition() + 8);
            createMap.putString(Analytics.Param.CODE, obtain.readString());
            createMap.putString("verificationId", readString);
            obtain.recycle();
            ReactNativeFirebaseAuthModule.this.sendPhoneStateEvent(this.f31998a, this.f31999b, "onVerificationComplete", createMap);
        }

        @Override // com.google.firebase.auth.PhoneAuthProvider.a
        public void onVerificationFailed(ob.k kVar) {
            Log.d(ReactNativeFirebaseAuthModule.TAG, "verifyPhoneNumber:verification:onVerificationFailed");
            WritableMap createMap = Arguments.createMap();
            createMap.putMap("error", ReactNativeFirebaseAuthModule.this.getJSError(kVar));
            ReactNativeFirebaseAuthModule.this.sendPhoneStateEvent(this.f31998a, this.f31999b, "onVerificationFailed", createMap);
        }
    }

    public ReactNativeFirebaseAuthModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
    }

    public static /* synthetic */ void A(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise, Task task) {
        reactNativeFirebaseAuthModule.lambda$getIdTokenResult$31(promise, task);
    }

    public static /* synthetic */ void B(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise, AuthResult authResult) {
        reactNativeFirebaseAuthModule.lambda$signInWithEmailAndPassword$6(promise, authResult);
    }

    public static /* synthetic */ void C(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise, AuthResult authResult) {
        reactNativeFirebaseAuthModule.lambda$signInWithEmailLink$8(promise, authResult);
    }

    public static /* synthetic */ void D(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise, Task task) {
        reactNativeFirebaseAuthModule.lambda$signInWithCredential$22(promise, task);
    }

    public static /* synthetic */ void E(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise, Task task) {
        reactNativeFirebaseAuthModule.lambda$verifyPasswordResetCode$33(promise, task);
    }

    public static /* synthetic */ void F(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise, AuthResult authResult) {
        reactNativeFirebaseAuthModule.lambda$createUserWithEmailAndPassword$4(promise, authResult);
    }

    public static /* synthetic */ void G(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise, Exception exc) {
        reactNativeFirebaseAuthModule.lambda$createUserWithEmailAndPassword$5(promise, exc);
    }

    public static /* synthetic */ void H(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, FirebaseAuth firebaseAuth, Promise promise, Task task) {
        reactNativeFirebaseAuthModule.lambda$updateEmail$18(firebaseAuth, promise, task);
    }

    public static /* synthetic */ void I(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise, Task task) {
        reactNativeFirebaseAuthModule.lambda$delete$14(promise, task);
    }

    public static /* synthetic */ void J(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise, Exception exc) {
        reactNativeFirebaseAuthModule.lambda$signInWithCustomToken$11(promise, exc);
    }

    public static /* synthetic */ void K(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, FirebaseAuth firebaseAuth, Promise promise, Task task) {
        reactNativeFirebaseAuthModule.lambda$reload$15(firebaseAuth, promise, task);
    }

    public static /* synthetic */ void L(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise, Task task) {
        reactNativeFirebaseAuthModule.lambda$confirmPasswordReset$24(promise, task);
    }

    public static /* synthetic */ void M(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise, Task task) {
        reactNativeFirebaseAuthModule.lambda$sendSignInLinkToEmail$13(promise, task);
    }

    public static /* synthetic */ void N(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, FirebaseAuth firebaseAuth, Promise promise, Task task) {
        reactNativeFirebaseAuthModule.lambda$sendEmailVerification$16(firebaseAuth, promise, task);
    }

    public static /* synthetic */ void O(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise, Task task) {
        reactNativeFirebaseAuthModule.lambda$confirmationResultConfirm$23(promise, task);
    }

    private ActionCodeSettings buildActionCodeSettings(ReadableMap readableMap) {
        ActionCodeSettings.a p12 = ActionCodeSettings.p1();
        String string = readableMap.getString(ImagesContract.URL);
        Objects.requireNonNull(string);
        ActionCodeSettings.a f10 = p12.f(string);
        if (readableMap.hasKey("handleCodeInApp")) {
            f10 = f10.d(readableMap.getBoolean("handleCodeInApp"));
        }
        if (readableMap.hasKey("dynamicLinkDomain")) {
            f10 = f10.c(readableMap.getString("dynamicLinkDomain"));
        }
        if (readableMap.hasKey(MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID)) {
            ReadableMap map = readableMap.getMap(MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
            Objects.requireNonNull(map);
            boolean z10 = map.hasKey("installApp") && map.getBoolean("installApp");
            String string2 = map.hasKey("minimumVersion") ? map.getString("minimumVersion") : null;
            String string3 = map.getString("packageName");
            Objects.requireNonNull(string3);
            f10 = f10.b(string3, z10, string2);
        }
        if (readableMap.hasKey("iOS")) {
            String string4 = readableMap.getMap("iOS").getString("bundleId");
            Objects.requireNonNull(string4);
            f10 = f10.e(string4);
        }
        return f10.a();
    }

    private WritableArray convertProviderData(List<? extends com.google.firebase.auth.d0> list, FirebaseUser firebaseUser) {
        WritableArray createArray = Arguments.createArray();
        for (com.google.firebase.auth.d0 d0Var : list) {
            if (!"firebase".equals(d0Var.q())) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("providerId", d0Var.q());
                createMap.putString("uid", d0Var.e());
                createMap.putString("displayName", d0Var.getDisplayName());
                Uri photoUrl = d0Var.getPhotoUrl();
                if (photoUrl != null && !"".equals(photoUrl.toString())) {
                    createMap.putString("photoURL", photoUrl.toString());
                } else {
                    createMap.putNull("photoURL");
                }
                String phoneNumber = d0Var.getPhoneNumber();
                if ("phone".equals(d0Var.q()) && (d0Var.getPhoneNumber() == null || "".equals(d0Var.getPhoneNumber()))) {
                    createMap.putString("phoneNumber", firebaseUser.getPhoneNumber());
                } else if (phoneNumber != null && !"".equals(phoneNumber)) {
                    createMap.putString("phoneNumber", phoneNumber);
                } else {
                    createMap.putNull("phoneNumber");
                }
                if ("password".equals(d0Var.q()) && (d0Var.getEmail() == null || "".equals(d0Var.getEmail()))) {
                    createMap.putString(Scopes.EMAIL, d0Var.e());
                } else if (d0Var.getEmail() != null && !"".equals(d0Var.getEmail())) {
                    createMap.putString(Scopes.EMAIL, d0Var.getEmail());
                } else {
                    createMap.putNull(Scopes.EMAIL);
                }
                createArray.pushMap(createMap);
            }
        }
        return createArray;
    }

    @ReactMethod
    private void createUserWithEmailAndPassword(String str, String str2, String str3, final Promise promise) {
        Log.d(TAG, "createUserWithEmailAndPassword");
        FirebaseAuth.getInstance(ob.e.o(str)).f(str2, str3).addOnSuccessListener(new OnSuccessListener() { // from class: io.invertase.firebase.auth.y
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                ReactNativeFirebaseAuthModule.F(ReactNativeFirebaseAuthModule.this, promise, (AuthResult) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: io.invertase.firebase.auth.r
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                ReactNativeFirebaseAuthModule.G(ReactNativeFirebaseAuthModule.this, promise, exc);
            }
        });
    }

    private WritableMap firebaseUserToMap(FirebaseUser firebaseUser) {
        WritableMap createMap = Arguments.createMap();
        String e10 = firebaseUser.e();
        String email = firebaseUser.getEmail();
        Uri photoUrl = firebaseUser.getPhotoUrl();
        String displayName = firebaseUser.getDisplayName();
        String q10 = firebaseUser.q();
        boolean r02 = firebaseUser.r0();
        String phoneNumber = firebaseUser.getPhoneNumber();
        String o12 = firebaseUser.o1();
        createMap.putString("uid", e10);
        createMap.putString("providerId", q10);
        createMap.putBoolean("emailVerified", r02);
        createMap.putBoolean("isAnonymous", firebaseUser.p1());
        if (email != null && !"".equals(email)) {
            createMap.putString(Scopes.EMAIL, email);
        } else {
            createMap.putNull(Scopes.EMAIL);
        }
        if (displayName != null && !"".equals(displayName)) {
            createMap.putString("displayName", displayName);
        } else {
            createMap.putNull("displayName");
        }
        if (photoUrl != null && !"".equals(photoUrl.toString())) {
            createMap.putString("photoURL", photoUrl.toString());
        } else {
            createMap.putNull("photoURL");
        }
        if (phoneNumber != null && !"".equals(phoneNumber)) {
            createMap.putString("phoneNumber", phoneNumber);
        } else {
            createMap.putNull("phoneNumber");
        }
        if (o12 != null && !"".equals(o12)) {
            createMap.putString("tenantId", o12);
        } else {
            createMap.putNull("tenantId");
        }
        createMap.putArray("providerData", convertProviderData(firebaseUser.n1(), firebaseUser));
        WritableMap createMap2 = Arguments.createMap();
        FirebaseUserMetadata l12 = firebaseUser.l1();
        if (l12 != null) {
            createMap2.putDouble("creationTime", l12.A());
            createMap2.putDouble("lastSignInTime", l12.L());
        }
        createMap.putMap("metadata", createMap2);
        return createMap;
    }

    public static /* synthetic */ void g(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, FirebaseAuth firebaseAuth, Promise promise, Task task) {
        reactNativeFirebaseAuthModule.lambda$verifyBeforeUpdateEmail$17(firebaseAuth, promise, task);
    }

    private AuthCredential getCredentialForProvider(String str, String str2, String str3) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2095271699:
                if (str.equals("apple.com")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1830313082:
                if (str.equals("twitter.com")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1536293812:
                if (str.equals("google.com")) {
                    c10 = 2;
                    break;
                }
                break;
            case -364826023:
                if (str.equals("facebook.com")) {
                    c10 = 3;
                    break;
                }
                break;
            case 105516695:
                if (str.equals("oauth")) {
                    c10 = 4;
                    break;
                }
                break;
            case 106642798:
                if (str.equals("phone")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1216985755:
                if (str.equals("password")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1985010934:
                if (str.equals("github.com")) {
                    c10 = 7;
                    break;
                }
                break;
            case 2120171958:
                if (str.equals("emailLink")) {
                    c10 = '\b';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return com.google.firebase.auth.y.b(str).b(str2, str3).a();
            case 1:
                return com.google.firebase.auth.c0.a(str2, str3);
            case 2:
                return com.google.firebase.auth.v.a(str2, str3);
            case 3:
                return com.google.firebase.auth.g.a(str2);
            case 4:
                return com.google.firebase.auth.y.a(str, str2, str3);
            case 5:
                return getPhoneAuthCredential(str2, str3);
            case 6:
                return com.google.firebase.auth.f.a(str2, str3);
            case 7:
                return com.google.firebase.auth.u.a(str2);
            case '\b':
                return com.google.firebase.auth.f.b(str2, str3);
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x010b, code lost:
        if (r6.equals("INVALID_CREDENTIAL") == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.react.bridge.WritableMap getJSError(java.lang.Exception r11) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule.getJSError(java.lang.Exception):com.facebook.react.bridge.WritableMap");
    }

    private PhoneAuthCredential getPhoneAuthCredential(String str, String str2) {
        PhoneAuthCredential phoneAuthCredential;
        if (str == null && (phoneAuthCredential = this.mCredential) != null) {
            this.mCredential = null;
            return phoneAuthCredential;
        } else if (str != null) {
            return PhoneAuthProvider.a(str, str2);
        } else {
            return null;
        }
    }

    public static /* synthetic */ void i(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, String str, FirebaseAuth firebaseAuth) {
        reactNativeFirebaseAuthModule.lambda$addIdTokenListener$1(str, firebaseAuth);
    }

    public static /* synthetic */ void j(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise, Exception exc) {
        reactNativeFirebaseAuthModule.lambda$signInWithEmailLink$9(promise, exc);
    }

    public static /* synthetic */ void k(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, String str, FirebaseAuth firebaseAuth) {
        reactNativeFirebaseAuthModule.lambda$addAuthStateListener$0(str, firebaseAuth);
    }

    public static /* synthetic */ void l(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise, Task task) {
        reactNativeFirebaseAuthModule.lambda$linkWithCredential$27(promise, task);
    }

    public /* synthetic */ void lambda$addAuthStateListener$0(String str, FirebaseAuth firebaseAuth) {
        FirebaseUser j10 = firebaseAuth.j();
        WritableMap createMap = Arguments.createMap();
        ce.g i10 = ce.g.i();
        if (j10 != null) {
            createMap.putString("appName", str);
            createMap.putMap("user", firebaseUserToMap(j10));
        } else {
            createMap.putString("appName", str);
        }
        Log.d(TAG, "addAuthStateListener:eventBody " + createMap.toString());
        i10.o(new ce.b("auth_state_changed", createMap, str));
    }

    public /* synthetic */ void lambda$addIdTokenListener$1(String str, FirebaseAuth firebaseAuth) {
        FirebaseUser j10 = firebaseAuth.j();
        ce.g i10 = ce.g.i();
        WritableMap createMap = Arguments.createMap();
        if (j10 != null) {
            createMap.putBoolean("authenticated", true);
            createMap.putString("appName", str);
            createMap.putMap("user", firebaseUserToMap(j10));
        } else {
            createMap.putString("appName", str);
            createMap.putBoolean("authenticated", false);
        }
        i10.o(new ce.b("auth_id_token_changed", createMap, str));
    }

    public /* synthetic */ void lambda$applyActionCode$25(FirebaseAuth firebaseAuth, Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "applyActionCode:onComplete:success");
            promiseWithUser(firebaseAuth.j(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "applyActionCode:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    public /* synthetic */ void lambda$checkActionCode$26(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "checkActionCode:onComplete:success");
            com.google.firebase.auth.d dVar = (com.google.firebase.auth.d) task.getResult();
            Objects.requireNonNull(dVar);
            com.google.firebase.auth.d dVar2 = dVar;
            WritableMap createMap = Arguments.createMap();
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putString(Scopes.EMAIL, dVar2.a(0));
            createMap2.putString("fromEmail", dVar2.a(1));
            createMap.putMap("data", createMap2);
            int b10 = dVar2.b();
            createMap.putString("operation", b10 != 0 ? b10 != 1 ? b10 != 2 ? b10 != 3 ? b10 != 4 ? NetworkName.UNKNOWN : "EMAIL_SIGNIN" : "ERROR" : "RECOVER_EMAIL" : "VERIFY_EMAIL" : "PASSWORD_RESET");
            promise.resolve(createMap);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "checkActionCode:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    public /* synthetic */ void lambda$confirmPasswordReset$24(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "confirmPasswordReset:onComplete:success");
            promiseNoUser(promise, Boolean.FALSE);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "confirmPasswordReset:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    public /* synthetic */ void lambda$confirmationResultConfirm$23(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "confirmationResultConfirm:signInWithCredential:onComplete:success");
            AuthResult authResult = (AuthResult) task.getResult();
            Objects.requireNonNull(authResult);
            promiseWithAuthResult(authResult, promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "confirmationResultConfirm:signInWithCredential:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    public /* synthetic */ void lambda$createUserWithEmailAndPassword$4(Promise promise, AuthResult authResult) {
        Log.d(TAG, "createUserWithEmailAndPassword:onComplete:success");
        promiseWithAuthResult(authResult, promise);
        Log.d(TAG, "createUserWithEmailAndPassword:onComplete:promiseResolved");
    }

    public /* synthetic */ void lambda$createUserWithEmailAndPassword$5(Promise promise, Exception exc) {
        Log.e(TAG, "createUserWithEmailAndPassword:onComplete:failure", exc);
        promiseRejectAuthException(promise, exc);
    }

    public /* synthetic */ void lambda$delete$14(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "delete:onComplete:success");
            promiseNoUser(promise, Boolean.FALSE);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "delete:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    public /* synthetic */ void lambda$fetchSignInMethodsForEmail$32(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "fetchProvidersForEmail:onComplete:success");
            com.google.firebase.auth.b0 b0Var = (com.google.firebase.auth.b0) task.getResult();
            Objects.requireNonNull(b0Var);
            List<String> a10 = b0Var.a();
            WritableArray createArray = Arguments.createArray();
            if (a10 != null) {
                for (String str : a10) {
                    createArray.pushString(str);
                }
            }
            promise.resolve(createArray);
            return;
        }
        Exception exception = task.getException();
        Log.d(TAG, "fetchProvidersForEmail:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    public /* synthetic */ void lambda$getIdToken$30(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "getIdToken:onComplete:success");
            com.google.firebase.auth.t tVar = (com.google.firebase.auth.t) task.getResult();
            Objects.requireNonNull(tVar);
            promise.resolve(tVar.f());
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "getIdToken:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    public /* synthetic */ void lambda$getIdTokenResult$31(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "getIdTokenResult:onComplete:success");
            com.google.firebase.auth.t tVar = (com.google.firebase.auth.t) task.getResult();
            WritableMap createMap = Arguments.createMap();
            Objects.requireNonNull(tVar);
            io.invertase.firebase.common.a.f("authTime", io.invertase.firebase.common.a.h(tVar.a()), createMap);
            io.invertase.firebase.common.a.f("expirationTime", io.invertase.firebase.common.a.h(tVar.c()), createMap);
            io.invertase.firebase.common.a.f("issuedAtTime", io.invertase.firebase.common.a.h(tVar.d()), createMap);
            io.invertase.firebase.common.a.f("claims", tVar.b(), createMap);
            io.invertase.firebase.common.a.f("signInProvider", tVar.e(), createMap);
            io.invertase.firebase.common.a.f(IronSourceConstants.IRONSOURCE_BIDDING_TOKEN_KEY, tVar.f(), createMap);
            promise.resolve(createMap);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "getIdTokenResult:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    public /* synthetic */ void lambda$linkWithCredential$27(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "link:onComplete:success");
            promiseWithAuthResult((AuthResult) task.getResult(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "link:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    public /* synthetic */ void lambda$reauthenticateWithCredential$29(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "reauthenticate:onComplete:success");
            promiseWithAuthResult((AuthResult) task.getResult(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "reauthenticate:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    public /* synthetic */ void lambda$reload$15(FirebaseAuth firebaseAuth, Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "reload:onComplete:success");
            promiseWithUser(firebaseAuth.j(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "reload:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    public /* synthetic */ void lambda$sendEmailVerification$16(FirebaseAuth firebaseAuth, Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "sendEmailVerification:onComplete:success");
            promiseWithUser(firebaseAuth.j(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "sendEmailVerification:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    public /* synthetic */ void lambda$sendPasswordResetEmail$12(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "sendPasswordResetEmail:onComplete:success");
            promiseNoUser(promise, Boolean.FALSE);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "sendPasswordResetEmail:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    public /* synthetic */ void lambda$sendSignInLinkToEmail$13(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "sendSignInLinkToEmail:onComplete:success");
            promiseNoUser(promise, Boolean.FALSE);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "sendSignInLinkToEmail:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    public /* synthetic */ void lambda$signInAnonymously$2(Promise promise, AuthResult authResult) {
        Log.d(TAG, "signInAnonymously:onComplete:success");
        promiseWithAuthResult(authResult, promise);
    }

    public /* synthetic */ void lambda$signInAnonymously$3(Promise promise, Exception exc) {
        Log.e(TAG, "signInAnonymously:onComplete:failure", exc);
        promiseRejectAuthException(promise, exc);
    }

    public /* synthetic */ void lambda$signInWithCredential$22(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "signInWithCredential:onComplete:success");
            promiseWithAuthResult((AuthResult) task.getResult(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "signInWithCredential:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    public /* synthetic */ void lambda$signInWithCustomToken$10(Promise promise, AuthResult authResult) {
        Log.d(TAG, "signInWithCustomToken:onComplete:success");
        promiseWithAuthResult(authResult, promise);
    }

    public /* synthetic */ void lambda$signInWithCustomToken$11(Promise promise, Exception exc) {
        Log.e(TAG, "signInWithCustomToken:onComplete:failure", exc);
        promiseRejectAuthException(promise, exc);
    }

    public /* synthetic */ void lambda$signInWithEmailAndPassword$6(Promise promise, AuthResult authResult) {
        Log.d(TAG, "signInWithEmailAndPassword:onComplete:success");
        promiseWithAuthResult(authResult, promise);
    }

    public /* synthetic */ void lambda$signInWithEmailAndPassword$7(Promise promise, Exception exc) {
        Log.e(TAG, "signInWithEmailAndPassword:onComplete:failure", exc);
        promiseRejectAuthException(promise, exc);
    }

    public /* synthetic */ void lambda$signInWithEmailLink$8(Promise promise, AuthResult authResult) {
        Log.d(TAG, "signInWithEmailLink:onComplete:success");
        promiseWithAuthResult(authResult, promise);
    }

    public /* synthetic */ void lambda$signInWithEmailLink$9(Promise promise, Exception exc) {
        Log.e(TAG, "signInWithEmailLink:onComplete:failure", exc);
        promiseRejectAuthException(promise, exc);
    }

    public /* synthetic */ void lambda$unlink$28(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "unlink:onComplete:success");
            AuthResult authResult = (AuthResult) task.getResult();
            Objects.requireNonNull(authResult);
            promiseWithUser(authResult.d0(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "unlink:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    public /* synthetic */ void lambda$updateEmail$18(FirebaseAuth firebaseAuth, Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "updateEmail:onComplete:success");
            promiseWithUser(firebaseAuth.j(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "updateEmail:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    public /* synthetic */ void lambda$updatePassword$19(FirebaseAuth firebaseAuth, Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "updatePassword:onComplete:success");
            promiseWithUser(firebaseAuth.j(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "updatePassword:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    public /* synthetic */ void lambda$updatePhoneNumber$20(FirebaseAuth firebaseAuth, Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "updatePhoneNumber:onComplete:success");
            promiseWithUser(firebaseAuth.j(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "updatePhoneNumber:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    public /* synthetic */ void lambda$updateProfile$21(FirebaseAuth firebaseAuth, Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "updateProfile:onComplete:success");
            promiseWithUser(firebaseAuth.j(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "updateProfile:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    public /* synthetic */ void lambda$verifyBeforeUpdateEmail$17(FirebaseAuth firebaseAuth, Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "verifyBeforeUpdateEmail:onComplete:success");
            promiseWithUser(firebaseAuth.j(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "verifyBeforeUpdateEmail:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    public /* synthetic */ void lambda$verifyPasswordResetCode$33(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "verifyPasswordResetCode:onComplete:success");
            promise.resolve(task.getResult());
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "verifyPasswordResetCode:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    @ReactMethod
    private void linkWithCredential(String str, String str2, String str3, String str4, final Promise promise) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(ob.e.o(str));
        AuthCredential credentialForProvider = getCredentialForProvider(str2, str3, str4);
        if (credentialForProvider == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential is malformed, has expired or is not currently supported.");
            return;
        }
        FirebaseUser j10 = firebaseAuth.j();
        Log.d(TAG, "link");
        if (j10 != null) {
            j10.q1(credentialForProvider).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.a
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.l(ReactNativeFirebaseAuthModule.this, promise, task);
                }
            });
        } else {
            promiseNoUser(promise, Boolean.TRUE);
        }
    }

    public static /* synthetic */ void m(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise, Task task) {
        reactNativeFirebaseAuthModule.lambda$getIdToken$30(promise, task);
    }

    public static /* synthetic */ void n(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise, Task task) {
        reactNativeFirebaseAuthModule.lambda$checkActionCode$26(promise, task);
    }

    public static /* synthetic */ void o(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, FirebaseAuth firebaseAuth, Promise promise, Task task) {
        reactNativeFirebaseAuthModule.lambda$updatePhoneNumber$20(firebaseAuth, promise, task);
    }

    public static /* synthetic */ void p(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, FirebaseAuth firebaseAuth, Promise promise, Task task) {
        reactNativeFirebaseAuthModule.lambda$updatePassword$19(firebaseAuth, promise, task);
    }

    private void promiseNoUser(Promise promise, Boolean bool) {
        if (bool.booleanValue()) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "no-current-user", "No user currently signed in.");
        } else {
            promise.resolve(null);
        }
    }

    public void promiseRejectAuthException(Promise promise, Exception exc) {
        WritableMap jSError = getJSError(exc);
        ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, jSError.getString(Analytics.Param.CODE), jSError.getString("message"));
    }

    private void promiseWithAuthResult(AuthResult authResult, Promise promise) {
        if (authResult != null && authResult.d0() != null) {
            WritableMap createMap = Arguments.createMap();
            WritableMap firebaseUserToMap = firebaseUserToMap(authResult.d0());
            if (authResult.K0() != null) {
                WritableMap createMap2 = Arguments.createMap();
                createMap2.putBoolean("isNewUser", authResult.K0().h0());
                if (authResult.K0().N0() != null) {
                    io.invertase.firebase.common.a.f(Scopes.PROFILE, authResult.K0().N0(), createMap2);
                }
                if (authResult.K0().q() != null) {
                    createMap2.putString("providerId", authResult.K0().q());
                }
                if (authResult.K0().z0() != null) {
                    createMap2.putString(AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER, authResult.K0().z0());
                }
                createMap.putMap("additionalUserInfo", createMap2);
            }
            createMap.putMap("user", firebaseUserToMap);
            promise.resolve(createMap);
            return;
        }
        promiseNoUser(promise, Boolean.TRUE);
    }

    private void promiseWithUser(FirebaseUser firebaseUser, Promise promise) {
        if (firebaseUser != null) {
            promise.resolve(firebaseUserToMap(firebaseUser));
        } else {
            promiseNoUser(promise, Boolean.TRUE);
        }
    }

    public static /* synthetic */ void q(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise, Task task) {
        reactNativeFirebaseAuthModule.lambda$fetchSignInMethodsForEmail$32(promise, task);
    }

    public static /* synthetic */ void r(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise, AuthResult authResult) {
        reactNativeFirebaseAuthModule.lambda$signInAnonymously$2(promise, authResult);
    }

    @ReactMethod
    private void reauthenticateWithCredential(String str, String str2, String str3, String str4, final Promise promise) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(ob.e.o(str));
        AuthCredential credentialForProvider = getCredentialForProvider(str2, str3, str4);
        if (credentialForProvider == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential is malformed, has expired or is not currently supported.");
            return;
        }
        FirebaseUser j10 = firebaseAuth.j();
        Log.d(TAG, "reauthenticate");
        if (j10 != null) {
            j10.r1(credentialForProvider).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.d0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.x(ReactNativeFirebaseAuthModule.this, promise, task);
                }
            });
        } else {
            promiseNoUser(promise, Boolean.TRUE);
        }
    }

    public static /* synthetic */ void s(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise, Task task) {
        reactNativeFirebaseAuthModule.lambda$unlink$28(promise, task);
    }

    public void sendPhoneStateEvent(String str, String str2, String str3, WritableMap writableMap) {
        WritableMap createMap = Arguments.createMap();
        ce.g i10 = ce.g.i();
        createMap.putString("appName", str);
        createMap.putString("requestKey", str2);
        createMap.putString("type", str3);
        createMap.putMap("state", writableMap);
        i10.o(new ce.b("phone_auth_state_changed", createMap, str));
    }

    @ReactMethod
    private void signInAnonymously(String str, final Promise promise) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(ob.e.o(str));
        Log.d(TAG, "signInAnonymously");
        firebaseAuth.u().addOnSuccessListener(new OnSuccessListener() { // from class: io.invertase.firebase.auth.t
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                ReactNativeFirebaseAuthModule.r(ReactNativeFirebaseAuthModule.this, promise, (AuthResult) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: io.invertase.firebase.auth.q
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                ReactNativeFirebaseAuthModule.v(ReactNativeFirebaseAuthModule.this, promise, exc);
            }
        });
    }

    @ReactMethod
    private void signInWithCredential(String str, String str2, String str3, String str4, final Promise promise) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(ob.e.o(str));
        AuthCredential credentialForProvider = getCredentialForProvider(str2, str3, str4);
        if (credentialForProvider == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential is malformed, has expired or is not currently supported.");
            return;
        }
        Log.d(TAG, "signInWithCredential");
        firebaseAuth.v(credentialForProvider).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.g0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.D(ReactNativeFirebaseAuthModule.this, promise, task);
            }
        });
    }

    @ReactMethod
    private void signInWithCustomToken(String str, String str2, final Promise promise) {
        Log.d(TAG, "signInWithCustomToken");
        FirebaseAuth.getInstance(ob.e.o(str)).w(str2).addOnSuccessListener(new OnSuccessListener() { // from class: io.invertase.firebase.auth.u
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                ReactNativeFirebaseAuthModule.u(ReactNativeFirebaseAuthModule.this, promise, (AuthResult) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: io.invertase.firebase.auth.s
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                ReactNativeFirebaseAuthModule.J(ReactNativeFirebaseAuthModule.this, promise, exc);
            }
        });
    }

    @ReactMethod
    private void signInWithEmailAndPassword(String str, String str2, String str3, final Promise promise) {
        Log.d(TAG, "signInWithEmailAndPassword");
        FirebaseAuth.getInstance(ob.e.o(str)).x(str2, str3).addOnSuccessListener(new OnSuccessListener() { // from class: io.invertase.firebase.auth.v
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                ReactNativeFirebaseAuthModule.B(ReactNativeFirebaseAuthModule.this, promise, (AuthResult) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: io.invertase.firebase.auth.p
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                ReactNativeFirebaseAuthModule.t(ReactNativeFirebaseAuthModule.this, promise, exc);
            }
        });
    }

    @ReactMethod
    private void signInWithEmailLink(String str, String str2, String str3, final Promise promise) {
        Log.d(TAG, "signInWithEmailLink");
        FirebaseAuth.getInstance(ob.e.o(str)).y(str2, str3).addOnSuccessListener(new OnSuccessListener() { // from class: io.invertase.firebase.auth.x
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                ReactNativeFirebaseAuthModule.C(ReactNativeFirebaseAuthModule.this, promise, (AuthResult) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: io.invertase.firebase.auth.o
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                ReactNativeFirebaseAuthModule.j(ReactNativeFirebaseAuthModule.this, promise, exc);
            }
        });
    }

    public static /* synthetic */ void t(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise, Exception exc) {
        reactNativeFirebaseAuthModule.lambda$signInWithEmailAndPassword$7(promise, exc);
    }

    public static /* synthetic */ void u(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise, AuthResult authResult) {
        reactNativeFirebaseAuthModule.lambda$signInWithCustomToken$10(promise, authResult);
    }

    @ReactMethod
    private void updatePhoneNumber(String str, String str2, String str3, String str4, final Promise promise) {
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(ob.e.o(str));
        FirebaseUser j10 = firebaseAuth.j();
        if (!str2.equals("phone")) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential does not have a phone provider.");
        }
        PhoneAuthCredential phoneAuthCredential = getPhoneAuthCredential(str3, str4);
        if (phoneAuthCredential == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential is malformed, has expired or is not currently supported.");
        } else if (j10 == null) {
            promiseNoUser(promise, Boolean.FALSE);
            Log.e(TAG, "updatePhoneNumber:failure:noCurrentUser");
        } else {
            Log.d(TAG, "updatePhoneNumber");
            j10.y1(phoneAuthCredential).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.g
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.o(ReactNativeFirebaseAuthModule.this, firebaseAuth, promise, task);
                }
            });
        }
    }

    public static /* synthetic */ void v(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise, Exception exc) {
        reactNativeFirebaseAuthModule.lambda$signInAnonymously$3(promise, exc);
    }

    public static /* synthetic */ void w(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, FirebaseAuth firebaseAuth, Promise promise, Task task) {
        reactNativeFirebaseAuthModule.lambda$applyActionCode$25(firebaseAuth, promise, task);
    }

    public static /* synthetic */ void x(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise, Task task) {
        reactNativeFirebaseAuthModule.lambda$reauthenticateWithCredential$29(promise, task);
    }

    public static /* synthetic */ void y(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, Promise promise, Task task) {
        reactNativeFirebaseAuthModule.lambda$sendPasswordResetEmail$12(promise, task);
    }

    public static /* synthetic */ void z(ReactNativeFirebaseAuthModule reactNativeFirebaseAuthModule, FirebaseAuth firebaseAuth, Promise promise, Task task) {
        reactNativeFirebaseAuthModule.lambda$updateProfile$21(firebaseAuth, promise, task);
    }

    @ReactMethod
    public void addAuthStateListener(final String str) {
        Log.d(TAG, "addAuthStateListener");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(ob.e.o(str));
        if (mAuthListeners.get(str) == null) {
            FirebaseAuth.a aVar = new FirebaseAuth.a() { // from class: io.invertase.firebase.auth.z
                @Override // com.google.firebase.auth.FirebaseAuth.a
                public final void a(FirebaseAuth firebaseAuth2) {
                    ReactNativeFirebaseAuthModule.k(ReactNativeFirebaseAuthModule.this, str, firebaseAuth2);
                }
            };
            firebaseAuth.a(aVar);
            mAuthListeners.put(str, aVar);
        }
    }

    @ReactMethod
    public void addIdTokenListener(final String str) {
        Log.d(TAG, "addIdTokenListener");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(ob.e.o(str));
        if (mIdTokenListeners.containsKey(str)) {
            return;
        }
        FirebaseAuth.b bVar = new FirebaseAuth.b() { // from class: io.invertase.firebase.auth.a0
            @Override // com.google.firebase.auth.FirebaseAuth.b
            public final void a(FirebaseAuth firebaseAuth2) {
                ReactNativeFirebaseAuthModule.i(ReactNativeFirebaseAuthModule.this, str, firebaseAuth2);
            }
        };
        firebaseAuth.b(bVar);
        mIdTokenListeners.put(str, bVar);
    }

    @ReactMethod
    public void applyActionCode(String str, String str2, final Promise promise) {
        Log.d(TAG, "applyActionCode");
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(ob.e.o(str));
        firebaseAuth.c(str2).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.i
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.w(ReactNativeFirebaseAuthModule.this, firebaseAuth, promise, task);
            }
        });
    }

    @ReactMethod
    public void checkActionCode(String str, String str2, final Promise promise) {
        Log.d(TAG, "checkActionCode");
        FirebaseAuth.getInstance(ob.e.o(str)).d(str2).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.w
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.n(ReactNativeFirebaseAuthModule.this, promise, task);
            }
        });
    }

    @ReactMethod
    public void confirmPasswordReset(String str, String str2, String str3, final Promise promise) {
        Log.d(TAG, "confirmPasswordReset");
        FirebaseAuth.getInstance(ob.e.o(str)).e(str2, str3).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.c
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.L(ReactNativeFirebaseAuthModule.this, promise, task);
            }
        });
    }

    @ReactMethod
    public void confirmationResultConfirm(String str, String str2, final Promise promise) {
        try {
            FirebaseAuth.getInstance(ob.e.o(str)).v(PhoneAuthProvider.a(this.mVerificationId, str2)).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.e
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.O(ReactNativeFirebaseAuthModule.this, promise, task);
                }
            });
        } catch (Exception e10) {
            Log.d(TAG, "confirmationResultConfirm::getCredential::failure", e10);
            promiseRejectAuthException(promise, e10);
        }
    }

    @ReactMethod
    public void delete(String str, final Promise promise) {
        FirebaseUser j10 = FirebaseAuth.getInstance(ob.e.o(str)).j();
        Log.d(TAG, "delete");
        if (j10 != null) {
            j10.j1().addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.b
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.I(ReactNativeFirebaseAuthModule.this, promise, task);
                }
            });
            return;
        }
        Log.e(TAG, "delete:failure:noCurrentUser");
        promiseNoUser(promise, Boolean.TRUE);
    }

    @ReactMethod
    public void fetchSignInMethodsForEmail(String str, String str2, final Promise promise) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(ob.e.o(str));
        Log.d(TAG, "fetchProvidersForEmail");
        firebaseAuth.g(str2).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.b0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.q(ReactNativeFirebaseAuthModule.this, promise, task);
            }
        });
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        List<ob.e> m10 = ob.e.m(getReactApplicationContext());
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        for (ob.e eVar : m10) {
            String p10 = eVar.p();
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(ob.e.o(p10));
            FirebaseUser j10 = firebaseAuth.j();
            hashMap2.put(p10, firebaseAuth.l());
            if (j10 != null) {
                hashMap3.put(p10, firebaseUserToMap(j10));
            }
        }
        hashMap.put("APP_LANGUAGE", hashMap2);
        hashMap.put("APP_USER", hashMap3);
        return hashMap;
    }

    @ReactMethod
    public void getIdToken(String str, Boolean bool, final Promise promise) {
        Log.d(TAG, "getIdToken");
        FirebaseUser j10 = FirebaseAuth.getInstance(ob.e.o(str)).j();
        if (j10 == null) {
            promiseNoUser(promise, Boolean.TRUE);
        } else {
            j10.k1(bool.booleanValue()).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.l
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.m(ReactNativeFirebaseAuthModule.this, promise, task);
                }
            });
        }
    }

    @ReactMethod
    public void getIdTokenResult(String str, Boolean bool, final Promise promise) {
        Log.d(TAG, "getIdTokenResult");
        FirebaseUser j10 = FirebaseAuth.getInstance(ob.e.o(str)).j();
        if (j10 == null) {
            promiseNoUser(promise, Boolean.TRUE);
        } else {
            j10.k1(bool.booleanValue()).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.f0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.A(ReactNativeFirebaseAuthModule.this, promise, task);
                }
            });
        }
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        Log.d(TAG, "instance-initialized");
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        Log.d(TAG, "instance-destroyed");
        Iterator<Map.Entry<String, FirebaseAuth.a>> it = mAuthListeners.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, FirebaseAuth.a> next = it.next();
            FirebaseAuth.getInstance(ob.e.o(next.getKey())).n(next.getValue());
            it.remove();
        }
        Iterator<Map.Entry<String, FirebaseAuth.b>> it2 = mIdTokenListeners.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<String, FirebaseAuth.b> next2 = it2.next();
            FirebaseAuth.getInstance(ob.e.o(next2.getKey())).o(next2.getValue());
            it2.remove();
        }
    }

    @ReactMethod
    public void reload(String str, final Promise promise) {
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(ob.e.o(str));
        FirebaseUser j10 = firebaseAuth.j();
        Log.d(TAG, "reload");
        if (j10 == null) {
            promiseNoUser(promise, Boolean.FALSE);
            Log.e(TAG, "reload:failure:noCurrentUser");
            return;
        }
        j10.s1().addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.m
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.K(ReactNativeFirebaseAuthModule.this, firebaseAuth, promise, task);
            }
        });
    }

    @ReactMethod
    public void removeAuthStateListener(String str) {
        Log.d(TAG, "removeAuthStateListener");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(ob.e.o(str));
        FirebaseAuth.a aVar = mAuthListeners.get(str);
        if (aVar != null) {
            firebaseAuth.n(aVar);
            mAuthListeners.remove(str);
        }
    }

    @ReactMethod
    public void removeIdTokenListener(String str) {
        Log.d(TAG, "removeIdTokenListener");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(ob.e.o(str));
        FirebaseAuth.b bVar = mIdTokenListeners.get(str);
        if (bVar != null) {
            firebaseAuth.o(bVar);
            mIdTokenListeners.remove(str);
        }
    }

    @ReactMethod
    public void sendEmailVerification(String str, ReadableMap readableMap, final Promise promise) {
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(ob.e.o(str));
        FirebaseUser j10 = firebaseAuth.j();
        Log.d(TAG, "sendEmailVerification");
        if (j10 == null) {
            promiseNoUser(promise, Boolean.FALSE);
            Log.e(TAG, "sendEmailVerification:failure:noCurrentUser");
            return;
        }
        OnCompleteListener<Void> onCompleteListener = new OnCompleteListener() { // from class: io.invertase.firebase.auth.n
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.N(ReactNativeFirebaseAuthModule.this, firebaseAuth, promise, task);
            }
        };
        if (readableMap == null) {
            j10.t1().addOnCompleteListener(getExecutor(), onCompleteListener);
        } else {
            j10.u1(buildActionCodeSettings(readableMap)).addOnCompleteListener(getExecutor(), onCompleteListener);
        }
    }

    @ReactMethod
    public void sendPasswordResetEmail(String str, String str2, ReadableMap readableMap, final Promise promise) {
        Log.d(TAG, "sendPasswordResetEmail");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(ob.e.o(str));
        OnCompleteListener<Void> onCompleteListener = new OnCompleteListener() { // from class: io.invertase.firebase.auth.e0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.y(ReactNativeFirebaseAuthModule.this, promise, task);
            }
        };
        if (readableMap == null) {
            firebaseAuth.p(str2).addOnCompleteListener(getExecutor(), onCompleteListener);
        } else {
            firebaseAuth.q(str2, buildActionCodeSettings(readableMap)).addOnCompleteListener(getExecutor(), onCompleteListener);
        }
    }

    @ReactMethod
    public void sendSignInLinkToEmail(String str, String str2, ReadableMap readableMap, final Promise promise) {
        Log.d(TAG, "sendSignInLinkToEmail");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(ob.e.o(str));
        firebaseAuth.r(str2, buildActionCodeSettings(readableMap)).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.d
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.M(ReactNativeFirebaseAuthModule.this, promise, task);
            }
        });
    }

    @ReactMethod
    public void setAppVerificationDisabledForTesting(String str, boolean z10, Promise promise) {
        Log.d(TAG, "setAppVerificationDisabledForTesting");
        FirebaseAuth.getInstance(ob.e.o(str)).k().a(z10);
        promise.resolve(null);
    }

    @ReactMethod
    public void setAutoRetrievedSmsCodeForPhoneNumber(String str, String str2, String str3, Promise promise) {
        Log.d(TAG, "setAutoRetrievedSmsCodeForPhoneNumber");
        FirebaseAuth.getInstance(ob.e.o(str)).k().b(str2, str3);
        promise.resolve(null);
    }

    @ReactMethod
    public void setLanguageCode(String str, String str2) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(ob.e.o(str));
        if (str2 == null) {
            firebaseAuth.A();
        } else {
            firebaseAuth.s(str2);
        }
    }

    @ReactMethod
    public void setTenantId(String str, String str2) {
        FirebaseAuth.getInstance(ob.e.o(str)).t(str2);
    }

    @ReactMethod
    public void signInWithPhoneNumber(String str, String str2, boolean z10, Promise promise) {
        Log.d(TAG, "signInWithPhoneNumber");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(ob.e.o(str));
        Activity currentActivity = getCurrentActivity();
        if (!str2.equals(this.mLastPhoneNumber)) {
            this.mForceResendingToken = null;
            this.mLastPhoneNumber = str2;
        }
        this.mVerificationId = null;
        a aVar = new a(firebaseAuth, promise);
        if (currentActivity != null) {
            if (z10 && this.mForceResendingToken != null) {
                PhoneAuthProvider.b(firebaseAuth).e(str2, 60L, TimeUnit.SECONDS, currentActivity, aVar, this.mForceResendingToken);
            } else {
                PhoneAuthProvider.b(firebaseAuth).d(str2, 60L, TimeUnit.SECONDS, currentActivity, aVar);
            }
        }
    }

    @ReactMethod
    public void signOut(String str, Promise promise) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(ob.e.o(str));
        Log.d(TAG, "signOut");
        if (firebaseAuth != null && firebaseAuth.j() != null) {
            firebaseAuth.z();
            promiseNoUser(promise, Boolean.FALSE);
            return;
        }
        promiseNoUser(promise, Boolean.TRUE);
    }

    @ReactMethod
    public void unlink(String str, String str2, final Promise promise) {
        FirebaseUser j10 = FirebaseAuth.getInstance(ob.e.o(str)).j();
        Log.d(TAG, "unlink");
        if (j10 != null) {
            j10.v1(str2).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.c0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.s(ReactNativeFirebaseAuthModule.this, promise, task);
                }
            });
        } else {
            promiseNoUser(promise, Boolean.TRUE);
        }
    }

    @ReactMethod
    public void updateEmail(String str, String str2, final Promise promise) {
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(ob.e.o(str));
        FirebaseUser j10 = firebaseAuth.j();
        Log.d(TAG, "updateEmail");
        if (j10 == null) {
            promiseNoUser(promise, Boolean.FALSE);
            Log.e(TAG, "updateEmail:failure:noCurrentUser");
            return;
        }
        j10.w1(str2).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.k
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.H(ReactNativeFirebaseAuthModule.this, firebaseAuth, promise, task);
            }
        });
    }

    @ReactMethod
    public void updatePassword(String str, String str2, final Promise promise) {
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(ob.e.o(str));
        FirebaseUser j10 = firebaseAuth.j();
        Log.d(TAG, "updatePassword");
        if (j10 == null) {
            promiseNoUser(promise, Boolean.FALSE);
            Log.e(TAG, "updatePassword:failure:noCurrentUser");
            return;
        }
        j10.x1(str2).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.h
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.p(ReactNativeFirebaseAuthModule.this, firebaseAuth, promise, task);
            }
        });
    }

    @ReactMethod
    public void updateProfile(String str, ReadableMap readableMap, final Promise promise) {
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(ob.e.o(str));
        FirebaseUser j10 = firebaseAuth.j();
        Log.d(TAG, "updateProfile");
        if (j10 == null) {
            promiseNoUser(promise, Boolean.FALSE);
            Log.e(TAG, "updateProfile:failure:noCurrentUser");
            return;
        }
        UserProfileChangeRequest.a aVar = new UserProfileChangeRequest.a();
        if (readableMap.hasKey("displayName")) {
            aVar.b(readableMap.getString("displayName"));
        }
        if (readableMap.hasKey("photoURL")) {
            String string = readableMap.getString("photoURL");
            aVar.c(string == null ? null : Uri.parse(string));
        }
        j10.z1(aVar.a()).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.j
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.z(ReactNativeFirebaseAuthModule.this, firebaseAuth, promise, task);
            }
        });
    }

    @ReactMethod
    public void useDeviceLanguage(String str) {
        FirebaseAuth.getInstance(ob.e.o(str)).A();
    }

    @ReactMethod
    public void useEmulator(String str, String str2, int i10) {
        Log.d(TAG, "useEmulator");
        FirebaseAuth.getInstance(ob.e.o(str)).B(str2, i10);
    }

    @ReactMethod
    public void verifyBeforeUpdateEmail(String str, String str2, ReadableMap readableMap, final Promise promise) {
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(ob.e.o(str));
        FirebaseUser j10 = firebaseAuth.j();
        Log.d(TAG, "verifyBeforeUpdateEmail");
        if (j10 == null) {
            promiseNoUser(promise, Boolean.FALSE);
            Log.e(TAG, "verifyBeforeUpdateEmail:failure:noCurrentUser");
            return;
        }
        OnCompleteListener<Void> onCompleteListener = new OnCompleteListener() { // from class: io.invertase.firebase.auth.f
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.g(ReactNativeFirebaseAuthModule.this, firebaseAuth, promise, task);
            }
        };
        if (readableMap == null) {
            j10.A1(str2).addOnCompleteListener(getExecutor(), onCompleteListener);
        } else {
            j10.B1(str2, buildActionCodeSettings(readableMap)).addOnCompleteListener(getExecutor(), onCompleteListener);
        }
    }

    @ReactMethod
    public void verifyPasswordResetCode(String str, String str2, final Promise promise) {
        Log.d(TAG, "verifyPasswordResetCode");
        FirebaseAuth.getInstance(ob.e.o(str)).C(str2).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.h0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.E(ReactNativeFirebaseAuthModule.this, promise, task);
            }
        });
    }

    @ReactMethod
    public void verifyPhoneNumber(String str, String str2, String str3, int i10, boolean z10) {
        Log.d(TAG, "verifyPhoneNumber:" + str2);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(ob.e.o(str));
        Activity currentActivity = getCurrentActivity();
        if (!str2.equals(this.mLastPhoneNumber)) {
            this.mForceResendingToken = null;
            this.mLastPhoneNumber = str2;
        }
        this.mCredential = null;
        b bVar = new b(str, str3);
        if (currentActivity != null) {
            if (z10 && this.mForceResendingToken != null) {
                PhoneAuthProvider.b(firebaseAuth).e(str2, i10, TimeUnit.SECONDS, currentActivity, bVar, this.mForceResendingToken);
            } else {
                PhoneAuthProvider.b(firebaseAuth).d(str2, i10, TimeUnit.SECONDS, currentActivity, bVar);
            }
        }
    }
}
