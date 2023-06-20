package com.facebook.react.views.textinput;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.applovin.sdk.AppLovinEventParameters;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.d;
import com.facebook.react.uimanager.f0;
import com.facebook.react.uimanager.m0;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.r;
import com.facebook.react.uimanager.t0;
import com.facebook.react.views.text.t;
import com.facebook.react.views.text.v;
import com.facebook.react.views.text.x;
import com.facebook.react.views.text.z;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.common.Scopes;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import fm.castbox.mediation.BuildConfig;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

@o6.a(name = ReactTextInputManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactTextInputManager extends BaseViewManager<com.facebook.react.views.textinput.c, com.facebook.react.uimanager.j> {
    private static final int AUTOCAPITALIZE_FLAGS = 28672;
    private static final int BLUR_TEXT_INPUT = 2;
    private static final int FOCUS_TEXT_INPUT = 1;
    private static final int IME_ACTION_ID = 1648;
    private static final int INPUT_TYPE_KEYBOARD_DECIMAL_PAD = 8194;
    private static final int INPUT_TYPE_KEYBOARD_NUMBERED = 12290;
    private static final int INPUT_TYPE_KEYBOARD_NUMBER_PAD = 2;
    private static final String KEYBOARD_TYPE_DECIMAL_PAD = "decimal-pad";
    private static final String KEYBOARD_TYPE_EMAIL_ADDRESS = "email-address";
    private static final String KEYBOARD_TYPE_NUMBER_PAD = "number-pad";
    private static final String KEYBOARD_TYPE_NUMERIC = "numeric";
    private static final String KEYBOARD_TYPE_PHONE_PAD = "phone-pad";
    private static final String KEYBOARD_TYPE_URI = "url";
    private static final String KEYBOARD_TYPE_VISIBLE_PASSWORD = "visible-password";
    private static final int PASSWORD_VISIBILITY_FLAG = 16;
    public static final String REACT_CLASS = "AndroidTextInput";
    private static final int SET_MOST_RECENT_EVENT_COUNT = 3;
    private static final int SET_TEXT_AND_SELECTION = 4;
    public static final String TAG = "ReactTextInputManager";
    private static final int UNSET = -1;
    protected com.facebook.react.views.text.p mReactTextViewManagerCallback;
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private static final Map<String, String> REACT_PROPS_AUTOFILL_HINTS_MAP = new a();
    private static final InputFilter[] EMPTY_FILTERS = new InputFilter[0];
    private static final String[] DRAWABLE_FIELDS = {"mCursorDrawable", "mSelectHandleLeft", "mSelectHandleRight", "mSelectHandleCenter"};
    private static final String[] DRAWABLE_RESOURCES = {"mCursorDrawableRes", "mTextSelectHandleLeftRes", "mTextSelectHandleRightRes", "mTextSelectHandleRes"};

    /* loaded from: classes.dex */
    class a extends HashMap<String, String> {
        a() {
            put("birthdate-day", "birthDateDay");
            put("birthdate-full", "birthDateFull");
            put("birthdate-month", "birthDateMonth");
            put("birthdate-year", "birthDateYear");
            put("cc-csc", "creditCardSecurityCode");
            put("cc-exp", "creditCardExpirationDate");
            put("cc-exp-day", "creditCardExpirationDay");
            put("cc-exp-month", "creditCardExpirationMonth");
            put("cc-exp-year", "creditCardExpirationYear");
            put("cc-number", "creditCardNumber");
            put(Scopes.EMAIL, "emailAddress");
            put(InneractiveMediationDefs.KEY_GENDER, InneractiveMediationDefs.KEY_GENDER);
            put("name", "personName");
            put("name-family", "personFamilyName");
            put("name-given", "personGivenName");
            put("name-middle", "personMiddleName");
            put("name-middle-initial", "personMiddleInitial");
            put("name-prefix", "personNamePrefix");
            put("name-suffix", "personNameSuffix");
            put("password", "password");
            put("password-new", "newPassword");
            put("postal-address", "postalAddress");
            put("postal-address-country", "addressCountry");
            put("postal-address-extended", "extendedAddress");
            put("postal-address-extended-postal-code", "extendedPostalCode");
            put("postal-address-locality", "addressLocality");
            put("postal-address-region", "addressRegion");
            put("postal-code", "postalCode");
            put("street-address", "streetAddress");
            put("sms-otp", "smsOTPCode");
            put("tel", "phoneNumber");
            put("tel-country-code", "phoneCountryCode");
            put("tel-national", "phoneNational");
            put("tel-device", "phoneNumberDevice");
            put(AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER, AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER);
            put("username-new", "newUsername");
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnLongClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f16301a;

        b(ReactTextInputManager reactTextInputManager, boolean z10) {
            this.f16301a = z10;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return this.f16301a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements View.OnFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n0 f16302a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.facebook.react.views.textinput.c f16303b;

        c(ReactTextInputManager reactTextInputManager, n0 n0Var, com.facebook.react.views.textinput.c cVar) {
            this.f16302a = n0Var;
            this.f16303b = cVar;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            int c10 = this.f16302a.c();
            com.facebook.react.uimanager.events.d eventDispatcher = ReactTextInputManager.getEventDispatcher(this.f16302a, this.f16303b);
            if (z10) {
                eventDispatcher.g(new i(c10, this.f16303b.getId()));
                return;
            }
            eventDispatcher.g(new com.facebook.react.views.textinput.f(c10, this.f16303b.getId()));
            eventDispatcher.g(new com.facebook.react.views.textinput.g(c10, this.f16303b.getId(), this.f16303b.getText().toString()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements TextView.OnEditorActionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.facebook.react.views.textinput.c f16304a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n0 f16305b;

        d(ReactTextInputManager reactTextInputManager, com.facebook.react.views.textinput.c cVar, n0 n0Var) {
            this.f16304a = cVar;
            this.f16305b = n0Var;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            if ((i10 & 255) != 0 || i10 == 0) {
                boolean blurOnSubmit = this.f16304a.getBlurOnSubmit();
                boolean p10 = this.f16304a.p();
                ReactTextInputManager.getEventDispatcher(this.f16305b, this.f16304a).g(new n(this.f16305b.c(), this.f16304a.getId(), this.f16304a.getText().toString()));
                if (blurOnSubmit) {
                    this.f16304a.clearFocus();
                }
                return blurOnSubmit || !p10 || i10 == 5 || i10 == 7;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    private static class e implements com.facebook.react.views.textinput.a {

        /* renamed from: a  reason: collision with root package name */
        private com.facebook.react.views.textinput.c f16306a;

        /* renamed from: b  reason: collision with root package name */
        private com.facebook.react.uimanager.events.d f16307b;

        /* renamed from: c  reason: collision with root package name */
        private int f16308c = 0;

        /* renamed from: d  reason: collision with root package name */
        private int f16309d = 0;

        /* renamed from: e  reason: collision with root package name */
        private int f16310e;

        public e(com.facebook.react.views.textinput.c cVar) {
            this.f16306a = cVar;
            ReactContext d10 = t0.d(cVar);
            this.f16307b = ReactTextInputManager.getEventDispatcher(d10, cVar);
            this.f16310e = t0.e(d10);
        }

        @Override // com.facebook.react.views.textinput.a
        public void a() {
            if (this.f16307b == null) {
                return;
            }
            int width = this.f16306a.getWidth();
            int height = this.f16306a.getHeight();
            if (this.f16306a.getLayout() != null) {
                width = this.f16306a.getCompoundPaddingLeft() + this.f16306a.getLayout().getWidth() + this.f16306a.getCompoundPaddingRight();
                height = this.f16306a.getCompoundPaddingTop() + this.f16306a.getLayout().getHeight() + this.f16306a.getCompoundPaddingBottom();
            }
            if (width == this.f16308c && height == this.f16309d) {
                return;
            }
            this.f16309d = height;
            this.f16308c = width;
            this.f16307b.g(new com.facebook.react.views.textinput.b(this.f16310e, this.f16306a.getId(), r.a(width), r.a(height)));
        }
    }

    /* loaded from: classes.dex */
    private static class f implements o {

        /* renamed from: a  reason: collision with root package name */
        private com.facebook.react.views.textinput.c f16311a;

        /* renamed from: b  reason: collision with root package name */
        private com.facebook.react.uimanager.events.d f16312b;

        /* renamed from: c  reason: collision with root package name */
        private int f16313c;

        /* renamed from: d  reason: collision with root package name */
        private int f16314d;

        /* renamed from: e  reason: collision with root package name */
        private int f16315e;

        public f(com.facebook.react.views.textinput.c cVar) {
            this.f16311a = cVar;
            ReactContext d10 = t0.d(cVar);
            this.f16312b = ReactTextInputManager.getEventDispatcher(d10, cVar);
            this.f16315e = t0.e(d10);
        }

        @Override // com.facebook.react.views.textinput.o
        public void a(int i10, int i11, int i12, int i13) {
            if (this.f16313c == i10 && this.f16314d == i11) {
                return;
            }
            this.f16312b.g(g7.g.b(this.f16315e, this.f16311a.getId(), com.facebook.react.views.scroll.b.SCROLL, i10, i11, 0.0f, 0.0f, 0, 0, this.f16311a.getWidth(), this.f16311a.getHeight()));
            this.f16313c = i10;
            this.f16314d = i11;
        }
    }

    /* loaded from: classes.dex */
    private class g implements p {

        /* renamed from: a  reason: collision with root package name */
        private com.facebook.react.views.textinput.c f16316a;

        /* renamed from: b  reason: collision with root package name */
        private com.facebook.react.uimanager.events.d f16317b;

        /* renamed from: c  reason: collision with root package name */
        private int f16318c;

        /* renamed from: d  reason: collision with root package name */
        private int f16319d;

        /* renamed from: e  reason: collision with root package name */
        private int f16320e;

        public g(ReactTextInputManager reactTextInputManager, com.facebook.react.views.textinput.c cVar) {
            this.f16316a = cVar;
            ReactContext d10 = t0.d(cVar);
            this.f16317b = ReactTextInputManager.getEventDispatcher(d10, cVar);
            this.f16320e = t0.e(d10);
        }

        @Override // com.facebook.react.views.textinput.p
        public void a(int i10, int i11) {
            int min = Math.min(i10, i11);
            int max = Math.max(i10, i11);
            if (this.f16318c == min && this.f16319d == max) {
                return;
            }
            this.f16317b.g(new l(this.f16320e, this.f16316a.getId(), min, max));
            this.f16318c = min;
            this.f16319d = max;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class h implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        private com.facebook.react.uimanager.events.d f16321a;

        /* renamed from: b  reason: collision with root package name */
        private com.facebook.react.views.textinput.c f16322b;

        /* renamed from: c  reason: collision with root package name */
        private String f16323c = null;

        /* renamed from: d  reason: collision with root package name */
        private int f16324d;

        /* loaded from: classes.dex */
        class a implements d.b {
            a() {
            }

            @Override // com.facebook.react.uimanager.d.b
            public WritableMap a() {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putInt("mostRecentEventCount", h.this.f16322b.o());
                writableNativeMap.putInt("opaqueCacheId", h.this.f16322b.getId());
                return writableNativeMap;
            }
        }

        public h(ReactTextInputManager reactTextInputManager, ReactContext reactContext, com.facebook.react.views.textinput.c cVar) {
            this.f16321a = ReactTextInputManager.getEventDispatcher(reactContext, cVar);
            this.f16322b = cVar;
            this.f16324d = t0.e(reactContext);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            this.f16323c = charSequence.toString();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (this.f16322b.I) {
                return;
            }
            if (i12 == 0 && i11 == 0) {
                return;
            }
            f6.a.c(this.f16323c);
            String substring = charSequence.toString().substring(i10, i10 + i12);
            int i13 = i10 + i11;
            String substring2 = this.f16323c.substring(i10, i13);
            if (i12 == i11 && substring.equals(substring2)) {
                return;
            }
            if (this.f16322b.getFabricViewStateManager().b()) {
                this.f16322b.getFabricViewStateManager().c(new a());
            }
            this.f16321a.g(new com.facebook.react.views.textinput.e(this.f16324d, this.f16322b.getId(), charSequence.toString(), this.f16322b.o()));
            this.f16321a.g(new com.facebook.react.views.textinput.h(this.f16324d, this.f16322b.getId(), substring, substring2, i10, i13));
        }
    }

    private static void checkPasswordType(com.facebook.react.views.textinput.c cVar) {
        if ((cVar.getStagedInputType() & INPUT_TYPE_KEYBOARD_NUMBERED) == 0 || (cVar.getStagedInputType() & 128) == 0) {
            return;
        }
        updateStagedInputTypeFlag(cVar, 128, 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.facebook.react.uimanager.events.d getEventDispatcher(ReactContext reactContext, com.facebook.react.views.textinput.c cVar) {
        return t0.c(reactContext, cVar.getId());
    }

    private com.facebook.react.views.text.n getReactTextUpdate(String str, int i10, int i11, int i12) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) z.a(str, z.UNSET));
        return new com.facebook.react.views.text.n(spannableStringBuilder, i10, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, i11, i12);
    }

    private void setAutofillHints(com.facebook.react.views.textinput.c cVar, String... strArr) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        cVar.setAutofillHints(strArr);
    }

    private static boolean shouldHideCursorForEmailTextInput() {
        return Build.VERSION.SDK_INT == 29 && Build.MANUFACTURER.toLowerCase().contains("xiaomi");
    }

    private static void updateStagedInputTypeFlag(com.facebook.react.views.textinput.c cVar, int i10, int i11) {
        cVar.setStagedInputType(((~i10) & cVar.getStagedInputType()) | i11);
    }

    protected EditText createInternalEditText(n0 n0Var) {
        return new EditText(n0Var);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return h6.e.e("focusTextInput", 1, "blurTextInput", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomBubblingEventTypeConstants = super.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants == null) {
            exportedCustomBubblingEventTypeConstants = new HashMap<>();
        }
        exportedCustomBubblingEventTypeConstants.putAll(h6.e.a().b("topSubmitEditing", h6.e.d("phasedRegistrationNames", h6.e.e("bubbled", "onSubmitEditing", "captured", "onSubmitEditingCapture"))).b("topEndEditing", h6.e.d("phasedRegistrationNames", h6.e.e("bubbled", "onEndEditing", "captured", "onEndEditingCapture"))).b("topTextInput", h6.e.d("phasedRegistrationNames", h6.e.e("bubbled", "onTextInput", "captured", "onTextInputCapture"))).b("topFocus", h6.e.d("phasedRegistrationNames", h6.e.e("bubbled", "onFocus", "captured", "onFocusCapture"))).b("topBlur", h6.e.d("phasedRegistrationNames", h6.e.e("bubbled", "onBlur", "captured", "onBlurCapture"))).b("topKeyPress", h6.e.d("phasedRegistrationNames", h6.e.e("bubbled", "onKeyPress", "captured", "onKeyPressCapture"))).a());
        return exportedCustomBubblingEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(h6.e.a().b(com.facebook.react.views.scroll.b.a(com.facebook.react.views.scroll.b.SCROLL), h6.e.d("registrationName", "onScroll")).a());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedViewConstants() {
        return h6.e.d("AutoCapitalizationType", h6.e.g("none", 0, "characters", 4096, "words", Integer.valueOf((int) Constants.BUFFER_SIZE), "sentences", 16384));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends com.facebook.react.uimanager.j> getShadowNodeClass() {
        return m.class;
    }

    @w6.a(defaultBoolean = BuildConfig.SHOULD_GZIP_HTTP_REQUEST, name = "allowFontScaling")
    public void setAllowFontScaling(com.facebook.react.views.textinput.c cVar, boolean z10) {
        cVar.setAllowFontScaling(z10);
    }

    @w6.a(name = "autoCapitalize")
    public void setAutoCapitalize(com.facebook.react.views.textinput.c cVar, Dynamic dynamic) {
        int i10 = 16384;
        if (dynamic.getType() == ReadableType.Number) {
            i10 = dynamic.asInt();
        } else if (dynamic.getType() == ReadableType.String) {
            String asString = dynamic.asString();
            if (asString.equals("none")) {
                i10 = 0;
            } else if (asString.equals("characters")) {
                i10 = 4096;
            } else if (asString.equals("words")) {
                i10 = Constants.BUFFER_SIZE;
            } else {
                asString.equals("sentences");
            }
        }
        updateStagedInputTypeFlag(cVar, AUTOCAPITALIZE_FLAGS, i10);
    }

    @w6.a(name = "autoCorrect")
    public void setAutoCorrect(com.facebook.react.views.textinput.c cVar, Boolean bool) {
        int i10;
        if (bool != null) {
            i10 = bool.booleanValue() ? 32768 : 524288;
        } else {
            i10 = 0;
        }
        updateStagedInputTypeFlag(cVar, 557056, i10);
    }

    @w6.a(defaultBoolean = false, name = "autoFocus")
    public void setAutoFocus(com.facebook.react.views.textinput.c cVar, boolean z10) {
        cVar.setAutoFocus(z10);
    }

    @w6.a(name = "blurOnSubmit")
    public void setBlurOnSubmit(com.facebook.react.views.textinput.c cVar, Boolean bool) {
        cVar.setBlurOnSubmit(bool);
    }

    @w6.b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(com.facebook.react.views.textinput.c cVar, int i10, Integer num) {
        cVar.B(SPACING_TYPES[i10], num == null ? Float.NaN : num.intValue() & 16777215, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    @w6.b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(com.facebook.react.views.textinput.c cVar, int i10, float f10) {
        if (!com.facebook.yoga.g.a(f10)) {
            f10 = r.c(f10);
        }
        if (i10 == 0) {
            cVar.setBorderRadius(f10);
        } else {
            cVar.C(f10, i10 - 1);
        }
    }

    @w6.a(name = "borderStyle")
    public void setBorderStyle(com.facebook.react.views.textinput.c cVar, String str) {
        cVar.setBorderStyle(str);
    }

    @w6.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(com.facebook.react.views.textinput.c cVar, int i10, float f10) {
        if (!com.facebook.yoga.g.a(f10)) {
            f10 = r.c(f10);
        }
        cVar.D(SPACING_TYPES[i10], f10);
    }

    @w6.a(defaultBoolean = false, name = "caretHidden")
    public void setCaretHidden(com.facebook.react.views.textinput.c cVar, boolean z10) {
        if (cVar.getStagedInputType() == 32 && shouldHideCursorForEmailTextInput()) {
            return;
        }
        cVar.setCursorVisible(!z10);
    }

    @w6.a(customType = "Color", name = "color")
    public void setColor(com.facebook.react.views.textinput.c cVar, Integer num) {
        if (num == null) {
            ColorStateList b10 = com.facebook.react.views.text.d.b(cVar.getContext());
            if (b10 != null) {
                cVar.setTextColor(b10);
                return;
            }
            Context context = cVar.getContext();
            String str = TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not get default text color from View Context: ");
            sb2.append(context != null ? context.getClass().getCanonicalName() : "null");
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException(sb2.toString()));
            return;
        }
        cVar.setTextColor(num.intValue());
    }

    @w6.a(defaultBoolean = false, name = "contextMenuHidden")
    public void setContextMenuHidden(com.facebook.react.views.textinput.c cVar, boolean z10) {
        cVar.setOnLongClickListener(new b(this, z10));
    }

    @w6.a(customType = "Color", name = "cursorColor")
    public void setCursorColor(com.facebook.react.views.textinput.c cVar, Integer num) {
        int i10;
        if (num == null) {
            return;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            Drawable textCursorDrawable = cVar.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                textCursorDrawable.setColorFilter(new BlendModeColorFilter(num.intValue(), BlendMode.SRC_IN));
                cVar.setTextCursorDrawable(textCursorDrawable);
            }
        } else if (i11 == 28) {
        } else {
            int i12 = 0;
            while (true) {
                String[] strArr = DRAWABLE_RESOURCES;
                if (i12 >= strArr.length) {
                    return;
                }
                try {
                    Field declaredField = TextView.class.getDeclaredField(strArr[i12]);
                    declaredField.setAccessible(true);
                    i10 = declaredField.getInt(cVar);
                } catch (IllegalAccessException | NoSuchFieldException unused) {
                }
                if (i10 == 0) {
                    return;
                }
                Drawable mutate = androidx.core.content.b.f(cVar.getContext(), i10).mutate();
                mutate.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
                Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                declaredField2.setAccessible(true);
                Object obj = declaredField2.get(cVar);
                Field declaredField3 = obj.getClass().getDeclaredField(DRAWABLE_FIELDS[i12]);
                declaredField3.setAccessible(true);
                if (strArr[i12] == "mCursorDrawableRes") {
                    declaredField3.set(obj, new Drawable[]{mutate, mutate});
                } else {
                    declaredField3.set(obj, mutate);
                }
                i12++;
            }
        }
    }

    @w6.a(defaultBoolean = false, name = "disableFullscreenUI")
    public void setDisableFullscreenUI(com.facebook.react.views.textinput.c cVar, boolean z10) {
        cVar.setDisableFullscreenUI(z10);
    }

    @w6.a(defaultBoolean = BuildConfig.SHOULD_GZIP_HTTP_REQUEST, name = "editable")
    public void setEditable(com.facebook.react.views.textinput.c cVar, boolean z10) {
        cVar.setEnabled(z10);
    }

    @w6.a(name = "fontFamily")
    public void setFontFamily(com.facebook.react.views.textinput.c cVar, String str) {
        cVar.setFontFamily(str);
    }

    @w6.a(defaultFloat = 14.0f, name = "fontSize")
    public void setFontSize(com.facebook.react.views.textinput.c cVar, float f10) {
        cVar.setFontSize(f10);
    }

    @w6.a(name = "fontStyle")
    public void setFontStyle(com.facebook.react.views.textinput.c cVar, String str) {
        cVar.setFontStyle(str);
    }

    @w6.a(name = "fontWeight")
    public void setFontWeight(com.facebook.react.views.textinput.c cVar, String str) {
        cVar.setFontWeight(str);
    }

    @w6.a(name = "importantForAutofill")
    public void setImportantForAutofill(com.facebook.react.views.textinput.c cVar, String str) {
        int i10;
        if ("no".equals(str)) {
            i10 = 2;
        } else if ("noExcludeDescendants".equals(str)) {
            i10 = 8;
        } else if ("yes".equals(str)) {
            i10 = 1;
        } else {
            i10 = "yesExcludeDescendants".equals(str) ? 4 : 0;
        }
        setImportantForAutofill(cVar, i10);
    }

    @w6.a(defaultBoolean = BuildConfig.SHOULD_GZIP_HTTP_REQUEST, name = "includeFontPadding")
    public void setIncludeFontPadding(com.facebook.react.views.textinput.c cVar, boolean z10) {
        cVar.setIncludeFontPadding(z10);
    }

    @w6.a(name = "inlineImageLeft")
    public void setInlineImageLeft(com.facebook.react.views.textinput.c cVar, String str) {
        cVar.setCompoundDrawablesWithIntrinsicBounds(f7.c.b().d(cVar.getContext(), str), 0, 0, 0);
    }

    @w6.a(name = "inlineImagePadding")
    public void setInlineImagePadding(com.facebook.react.views.textinput.c cVar, int i10) {
        cVar.setCompoundDrawablePadding(i10);
    }

    @w6.a(name = "keyboardType")
    public void setKeyboardType(com.facebook.react.views.textinput.c cVar, String str) {
        int i10;
        if (KEYBOARD_TYPE_NUMERIC.equalsIgnoreCase(str)) {
            i10 = INPUT_TYPE_KEYBOARD_NUMBERED;
        } else if (KEYBOARD_TYPE_NUMBER_PAD.equalsIgnoreCase(str)) {
            i10 = 2;
        } else if (KEYBOARD_TYPE_DECIMAL_PAD.equalsIgnoreCase(str)) {
            i10 = INPUT_TYPE_KEYBOARD_DECIMAL_PAD;
        } else if (KEYBOARD_TYPE_EMAIL_ADDRESS.equalsIgnoreCase(str)) {
            i10 = 33;
            if (shouldHideCursorForEmailTextInput()) {
                cVar.setCursorVisible(false);
            }
        } else if (KEYBOARD_TYPE_PHONE_PAD.equalsIgnoreCase(str)) {
            i10 = 3;
        } else if (KEYBOARD_TYPE_VISIBLE_PASSWORD.equalsIgnoreCase(str)) {
            i10 = 144;
        } else {
            i10 = "url".equalsIgnoreCase(str) ? 16 : 1;
        }
        updateStagedInputTypeFlag(cVar, 15, i10);
        checkPasswordType(cVar);
    }

    @w6.a(defaultFloat = 0.0f, name = "letterSpacing")
    public void setLetterSpacing(com.facebook.react.views.textinput.c cVar, float f10) {
        cVar.setLetterSpacingPt(f10);
    }

    @w6.a(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(com.facebook.react.views.textinput.c cVar, float f10) {
        cVar.setMaxFontSizeMultiplier(f10);
    }

    @w6.a(name = "maxLength")
    public void setMaxLength(com.facebook.react.views.textinput.c cVar, Integer num) {
        InputFilter[] filters = cVar.getFilters();
        InputFilter[] inputFilterArr = EMPTY_FILTERS;
        if (num == null) {
            if (filters.length > 0) {
                LinkedList linkedList = new LinkedList();
                for (int i10 = 0; i10 < filters.length; i10++) {
                    if (!(filters[i10] instanceof InputFilter.LengthFilter)) {
                        linkedList.add(filters[i10]);
                    }
                }
                if (!linkedList.isEmpty()) {
                    inputFilterArr = (InputFilter[]) linkedList.toArray(new InputFilter[linkedList.size()]);
                }
            }
        } else if (filters.length > 0) {
            boolean z10 = false;
            for (int i11 = 0; i11 < filters.length; i11++) {
                if (filters[i11] instanceof InputFilter.LengthFilter) {
                    filters[i11] = new InputFilter.LengthFilter(num.intValue());
                    z10 = true;
                }
            }
            if (!z10) {
                InputFilter[] inputFilterArr2 = new InputFilter[filters.length + 1];
                System.arraycopy(filters, 0, inputFilterArr2, 0, filters.length);
                filters[filters.length] = new InputFilter.LengthFilter(num.intValue());
                filters = inputFilterArr2;
            }
            inputFilterArr = filters;
        } else {
            inputFilterArr = new InputFilter[]{new InputFilter.LengthFilter(num.intValue())};
        }
        cVar.setFilters(inputFilterArr);
    }

    @w6.a(defaultBoolean = false, name = "multiline")
    public void setMultiline(com.facebook.react.views.textinput.c cVar, boolean z10) {
        updateStagedInputTypeFlag(cVar, z10 ? 0 : 131072, z10 ? 131072 : 0);
    }

    @w6.a(defaultInt = 1, name = "numberOfLines")
    public void setNumLines(com.facebook.react.views.textinput.c cVar, int i10) {
        cVar.setLines(i10);
    }

    @w6.a(defaultBoolean = false, name = "onContentSizeChange")
    public void setOnContentSizeChange(com.facebook.react.views.textinput.c cVar, boolean z10) {
        if (z10) {
            cVar.setContentSizeWatcher(new e(cVar));
        } else {
            cVar.setContentSizeWatcher(null);
        }
    }

    @w6.a(defaultBoolean = false, name = "onKeyPress")
    public void setOnKeyPress(com.facebook.react.views.textinput.c cVar, boolean z10) {
        cVar.setOnKeyPress(z10);
    }

    @w6.a(defaultBoolean = false, name = "onScroll")
    public void setOnScroll(com.facebook.react.views.textinput.c cVar, boolean z10) {
        if (z10) {
            cVar.setScrollWatcher(new f(cVar));
        } else {
            cVar.setScrollWatcher(null);
        }
    }

    @w6.a(defaultBoolean = false, name = "onSelectionChange")
    public void setOnSelectionChange(com.facebook.react.views.textinput.c cVar, boolean z10) {
        if (z10) {
            cVar.setSelectionWatcher(new g(this, cVar));
        } else {
            cVar.setSelectionWatcher(null);
        }
    }

    @w6.a(name = "placeholder")
    public void setPlaceholder(com.facebook.react.views.textinput.c cVar, String str) {
        cVar.setHint(str);
    }

    @w6.a(customType = "Color", name = "placeholderTextColor")
    public void setPlaceholderTextColor(com.facebook.react.views.textinput.c cVar, Integer num) {
        if (num == null) {
            cVar.setHintTextColor(com.facebook.react.views.text.d.d(cVar.getContext()));
        } else {
            cVar.setHintTextColor(num.intValue());
        }
    }

    @w6.a(name = "returnKeyLabel")
    public void setReturnKeyLabel(com.facebook.react.views.textinput.c cVar, String str) {
        cVar.setImeActionLabel(str, IME_ACTION_ID);
    }

    @w6.a(name = "returnKeyType")
    public void setReturnKeyType(com.facebook.react.views.textinput.c cVar, String str) {
        cVar.setReturnKeyType(str);
    }

    @w6.a(defaultBoolean = false, name = "secureTextEntry")
    public void setSecureTextEntry(com.facebook.react.views.textinput.c cVar, boolean z10) {
        updateStagedInputTypeFlag(cVar, 144, z10 ? 128 : 0);
        checkPasswordType(cVar);
    }

    @w6.a(defaultBoolean = false, name = "selectTextOnFocus")
    public void setSelectTextOnFocus(com.facebook.react.views.textinput.c cVar, boolean z10) {
        cVar.setSelectAllOnFocus(z10);
    }

    @w6.a(customType = "Color", name = "selectionColor")
    public void setSelectionColor(com.facebook.react.views.textinput.c cVar, Integer num) {
        if (num == null) {
            cVar.setHighlightColor(com.facebook.react.views.text.d.c(cVar.getContext()));
        } else {
            cVar.setHighlightColor(num.intValue());
        }
        setCursorColor(cVar, num);
    }

    @w6.a(name = "textAlign")
    public void setTextAlign(com.facebook.react.views.textinput.c cVar, String str) {
        if ("justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                cVar.setJustificationMode(1);
            }
            cVar.setGravityHorizontal(3);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            cVar.setJustificationMode(0);
        }
        if (str != null && !"auto".equals(str)) {
            if ("left".equals(str)) {
                cVar.setGravityHorizontal(3);
                return;
            } else if ("right".equals(str)) {
                cVar.setGravityHorizontal(5);
                return;
            } else if ("center".equals(str)) {
                cVar.setGravityHorizontal(1);
                return;
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid textAlign: " + str);
            }
        }
        cVar.setGravityHorizontal(0);
    }

    @w6.a(name = "textAlignVertical")
    public void setTextAlignVertical(com.facebook.react.views.textinput.c cVar, String str) {
        if (str != null && !"auto".equals(str)) {
            if ("top".equals(str)) {
                cVar.setGravityVertical(48);
                return;
            } else if ("bottom".equals(str)) {
                cVar.setGravityVertical(80);
                return;
            } else if ("center".equals(str)) {
                cVar.setGravityVertical(16);
                return;
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid textAlignVertical: " + str);
            }
        }
        cVar.setGravityVertical(0);
    }

    @w6.a(name = "autoComplete")
    public void setTextContentType(com.facebook.react.views.textinput.c cVar, String str) {
        if (str == null) {
            setImportantForAutofill(cVar, 2);
        } else if ("off".equals(str)) {
            setImportantForAutofill(cVar, 2);
        } else {
            Map<String, String> map = REACT_PROPS_AUTOFILL_HINTS_MAP;
            if (map.containsKey(str)) {
                setAutofillHints(cVar, map.get(str));
                return;
            }
            throw new JSApplicationIllegalArgumentException("Invalid autoComplete: " + str);
        }
    }

    @w6.a(customType = "Color", name = "underlineColorAndroid")
    public void setUnderlineColor(com.facebook.react.views.textinput.c cVar, Integer num) {
        Drawable background = cVar.getBackground();
        if (background.getConstantState() != null) {
            try {
                background = background.mutate();
            } catch (NullPointerException e10) {
                z3.a.k(TAG, "NullPointerException when setting underlineColorAndroid for TextInput", e10);
            }
        }
        if (num == null) {
            background.clearColorFilter();
        } else {
            background.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @w6.a(defaultBoolean = BuildConfig.SHOULD_GZIP_HTTP_REQUEST, name = "showSoftInputOnFocus")
    public void showKeyboardOnFocus(com.facebook.react.views.textinput.c cVar, boolean z10) {
        cVar.setShowSoftInputOnFocus(z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(n0 n0Var, com.facebook.react.views.textinput.c cVar) {
        cVar.setEventDispatcher(getEventDispatcher(n0Var, cVar));
        cVar.addTextChangedListener(new h(this, n0Var, cVar));
        cVar.setOnFocusChangeListener(new c(this, n0Var, cVar));
        cVar.setOnEditorActionListener(new d(this, cVar, n0Var));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.text.f createShadowNodeInstance() {
        return new m();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.textinput.c createViewInstance(n0 n0Var) {
        com.facebook.react.views.textinput.c cVar = new com.facebook.react.views.textinput.c(n0Var);
        cVar.setInputType(cVar.getInputType() & (-131073));
        cVar.setReturnKeyType("done");
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(com.facebook.react.views.textinput.c cVar) {
        super.onAfterUpdateTransaction((ReactTextInputManager) cVar);
        cVar.w();
        cVar.m();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(com.facebook.react.views.textinput.c cVar, int i10, int i11, int i12, int i13) {
        cVar.setPadding(i10, i11, i12, i13);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(com.facebook.react.views.textinput.c cVar, Object obj) {
        if (obj instanceof com.facebook.react.views.text.n) {
            com.facebook.react.views.text.n nVar = (com.facebook.react.views.text.n) obj;
            int f10 = (int) nVar.f();
            int h10 = (int) nVar.h();
            int g10 = (int) nVar.g();
            int e10 = (int) nVar.e();
            if (f10 != -1 || h10 != -1 || g10 != -1 || e10 != -1) {
                if (f10 == -1) {
                    f10 = cVar.getPaddingLeft();
                }
                if (h10 == -1) {
                    h10 = cVar.getPaddingTop();
                }
                if (g10 == -1) {
                    g10 = cVar.getPaddingRight();
                }
                if (e10 == -1) {
                    e10 = cVar.getPaddingBottom();
                }
                cVar.setPadding(f10, h10, g10, e10);
            }
            if (nVar.b()) {
                v.g(nVar.k(), cVar);
            }
            boolean z10 = cVar.getSelectionStart() == cVar.getSelectionEnd();
            int j10 = nVar.j();
            int i10 = nVar.i();
            if ((j10 == -1 || i10 == -1) && z10) {
                j10 = nVar.k().length() - ((cVar.getText() != null ? cVar.getText().length() : 0) - cVar.getSelectionStart());
                i10 = j10;
            }
            cVar.v(nVar);
            cVar.s(nVar.c(), j10, i10);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(com.facebook.react.views.textinput.c cVar, f0 f0Var, m0 m0Var) {
        ReadableNativeMap b10;
        cVar.getFabricViewStateManager().e(m0Var);
        if (m0Var == null || (b10 = m0Var.b()) == null || !b10.hasKey("attributedString")) {
            return null;
        }
        ReadableNativeMap map = b10.getMap("attributedString");
        ReadableNativeMap map2 = b10.getMap("paragraphAttributes");
        if (map != null && map2 != null) {
            return com.facebook.react.views.text.n.a(x.e(cVar.getContext(), map, this.mReactTextViewManagerCallback), b10.getInt("mostRecentEventCount"), t.m(f0Var, x.f(map)), t.n(map2.getString("textBreakStrategy")), t.i(f0Var), map.getArray("fragments").toArrayList().size() > 1);
        }
        throw new IllegalArgumentException("Invalid TextInput State was received as a parameters");
    }

    public com.facebook.react.views.text.f createShadowNodeInstance(com.facebook.react.views.text.p pVar) {
        return new m(pVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(com.facebook.react.views.textinput.c cVar, int i10, ReadableArray readableArray) {
        if (i10 == 1) {
            receiveCommand(cVar, "focus", readableArray);
        } else if (i10 == 2) {
            receiveCommand(cVar, "blur", readableArray);
        } else if (i10 != 4) {
        } else {
            receiveCommand(cVar, "setTextAndSelection", readableArray);
        }
    }

    private void setImportantForAutofill(com.facebook.react.views.textinput.c cVar, int i10) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        cVar.setImportantForAutofill(i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(com.facebook.react.views.textinput.c cVar, String str, ReadableArray readableArray) {
        char c10;
        str.hashCode();
        switch (str.hashCode()) {
            case -1699362314:
                if (str.equals("blurTextInput")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 3027047:
                if (str.equals("blur")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 97604824:
                if (str.equals("focus")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1427010500:
                if (str.equals("setTextAndSelection")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1690703013:
                if (str.equals("focusTextInput")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                cVar.l();
                return;
            case 2:
            case 4:
                cVar.y();
                return;
            case 3:
                int i10 = readableArray.getInt(0);
                if (i10 == -1) {
                    return;
                }
                int i11 = readableArray.getInt(2);
                int i12 = readableArray.getInt(3);
                if (i12 == -1) {
                    i12 = i11;
                }
                if (!readableArray.isNull(1)) {
                    cVar.u(getReactTextUpdate(readableArray.getString(1), i10, i11, i12));
                }
                cVar.s(i10, i11, i12);
                return;
            default:
                return;
        }
    }
}
