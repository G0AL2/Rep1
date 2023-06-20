package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SearchView extends k0 implements i.c {

    /* renamed from: w0  reason: collision with root package name */
    static final n f1275w0;
    private Rect A;
    private int[] B;
    private int[] C;
    private final ImageView D;
    private final Drawable E;
    private final int F;
    private final int G;
    private final Intent H;
    private final Intent I;
    private final CharSequence J;
    private l K;
    private k L;
    View.OnFocusChangeListener M;
    private m N;
    private View.OnClickListener O;
    private boolean P;
    private boolean Q;
    l0.a R;
    private boolean S;
    private CharSequence T;
    private boolean U;
    private boolean V;
    private int W;

    /* renamed from: g0  reason: collision with root package name */
    private boolean f1276g0;

    /* renamed from: h0  reason: collision with root package name */
    private CharSequence f1277h0;

    /* renamed from: i0  reason: collision with root package name */
    private CharSequence f1278i0;

    /* renamed from: j0  reason: collision with root package name */
    private boolean f1279j0;

    /* renamed from: k0  reason: collision with root package name */
    private int f1280k0;

    /* renamed from: l0  reason: collision with root package name */
    SearchableInfo f1281l0;

    /* renamed from: m0  reason: collision with root package name */
    private Bundle f1282m0;

    /* renamed from: n0  reason: collision with root package name */
    private final Runnable f1283n0;

    /* renamed from: o0  reason: collision with root package name */
    private Runnable f1284o0;

    /* renamed from: p  reason: collision with root package name */
    final SearchAutoComplete f1285p;

    /* renamed from: p0  reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f1286p0;

    /* renamed from: q  reason: collision with root package name */
    private final View f1287q;

    /* renamed from: q0  reason: collision with root package name */
    private final View.OnClickListener f1288q0;

    /* renamed from: r  reason: collision with root package name */
    private final View f1289r;

    /* renamed from: r0  reason: collision with root package name */
    View.OnKeyListener f1290r0;

    /* renamed from: s  reason: collision with root package name */
    private final View f1291s;

    /* renamed from: s0  reason: collision with root package name */
    private final TextView.OnEditorActionListener f1292s0;

    /* renamed from: t  reason: collision with root package name */
    final ImageView f1293t;

    /* renamed from: t0  reason: collision with root package name */
    private final AdapterView.OnItemClickListener f1294t0;

    /* renamed from: u  reason: collision with root package name */
    final ImageView f1295u;

    /* renamed from: u0  reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f1296u0;

    /* renamed from: v  reason: collision with root package name */
    final ImageView f1297v;

    /* renamed from: v0  reason: collision with root package name */
    private TextWatcher f1298v0;

    /* renamed from: w  reason: collision with root package name */
    final ImageView f1299w;

    /* renamed from: x  reason: collision with root package name */
    private final View f1300x;

    /* renamed from: y  reason: collision with root package name */
    private o f1301y;

    /* renamed from: z  reason: collision with root package name */
    private Rect f1302z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        boolean f1303c;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1303c + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f1303c));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1303c = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends androidx.appcompat.widget.d {

        /* renamed from: e  reason: collision with root package name */
        private int f1304e;

        /* renamed from: f  reason: collision with root package name */
        private SearchView f1305f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f1306g;

        /* renamed from: h  reason: collision with root package name */
        final Runnable f1307h;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, d.a.f28670p);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 < 960 || i11 < 720 || configuration.orientation != 2) {
                if (i10 < 600) {
                    if (i10 < 640 || i11 < 480) {
                        return 160;
                    }
                    return DownloadResource.STATUS_RUNNING;
                }
                return DownloadResource.STATUS_RUNNING;
            }
            return 256;
        }

        void b() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f1275w0.c(this);
        }

        boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void d() {
            if (this.f1306g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1306g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f1304e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1306g) {
                removeCallbacks(this.f1307h);
                post(this.f1307h);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            this.f1305f.Z();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1305f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f1305f.hasFocus() && getVisibility() == 0) {
                this.f1306g = true;
                if (SearchView.M(getContext())) {
                    b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f1306g = false;
                removeCallbacks(this.f1307h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f1306g = false;
                removeCallbacks(this.f1307h);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f1306g = true;
            }
        }

        void setSearchView(SearchView searchView) {
            this.f1305f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f1304e = i10;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f1307h = new a();
            this.f1304e = getThreshold();
        }
    }

    /* loaded from: classes.dex */
    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.Y(charSequence);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.f0();
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l0.a aVar = SearchView.this.R;
            if (aVar instanceof s0) {
                aVar.a(null);
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.M;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    /* loaded from: classes.dex */
    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.B();
        }
    }

    /* loaded from: classes.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f1293t) {
                searchView.V();
            } else if (view == searchView.f1297v) {
                searchView.R();
            } else if (view == searchView.f1295u) {
                searchView.W();
            } else if (view == searchView.f1299w) {
                searchView.a0();
            } else if (view == searchView.f1285p) {
                searchView.H();
            }
        }
    }

    /* loaded from: classes.dex */
    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1281l0 == null) {
                return false;
            }
            if (searchView.f1285p.isPopupShowing() && SearchView.this.f1285p.getListSelection() != -1) {
                return SearchView.this.X(view, i10, keyEvent);
            }
            if (!SearchView.this.f1285p.c() && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i10 == 66) {
                view.cancelLongPress();
                SearchView searchView2 = SearchView.this;
                searchView2.P(0, null, searchView2.f1285p.getText().toString());
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.W();
            return true;
        }
    }

    /* loaded from: classes.dex */
    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.S(i10, 0, null);
        }
    }

    /* loaded from: classes.dex */
    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.T(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        boolean a();
    }

    /* loaded from: classes.dex */
    public interface l {
        boolean a(String str);

        boolean b(String str);
    }

    /* loaded from: classes.dex */
    public interface m {
        boolean a(int i10);

        boolean b(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class n {

        /* renamed from: a  reason: collision with root package name */
        private Method f1319a;

        /* renamed from: b  reason: collision with root package name */
        private Method f1320b;

        /* renamed from: c  reason: collision with root package name */
        private Method f1321c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        n() {
            this.f1319a = null;
            this.f1320b = null;
            this.f1321c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1319a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1320b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1321c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1320b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1319a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1321c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* loaded from: classes.dex */
    private static class o extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        private final View f1322a;

        /* renamed from: b  reason: collision with root package name */
        private final Rect f1323b;

        /* renamed from: c  reason: collision with root package name */
        private final Rect f1324c;

        /* renamed from: d  reason: collision with root package name */
        private final Rect f1325d;

        /* renamed from: e  reason: collision with root package name */
        private final int f1326e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f1327f;

        public o(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1326e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f1323b = new Rect();
            this.f1325d = new Rect();
            this.f1324c = new Rect();
            a(rect, rect2);
            this.f1322a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f1323b.set(rect);
            this.f1325d.set(rect);
            Rect rect3 = this.f1325d;
            int i10 = this.f1326e;
            rect3.inset(-i10, -i10);
            this.f1324c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f1327f;
                    if (z11 && !this.f1325d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else {
                    if (action == 3) {
                        z11 = this.f1327f;
                        this.f1327f = false;
                    }
                    z10 = true;
                    z12 = false;
                }
                z12 = z11;
                z10 = true;
            } else {
                if (this.f1323b.contains(x10, y10)) {
                    this.f1327f = true;
                    z10 = true;
                }
                z10 = true;
                z12 = false;
            }
            if (z12) {
                if (z10 && !this.f1324c.contains(x10, y10)) {
                    motionEvent.setLocation(this.f1322a.getWidth() / 2, this.f1322a.getHeight() / 2);
                } else {
                    Rect rect = this.f1324c;
                    motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
                }
                return this.f1322a.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
    }

    static {
        f1275w0 = Build.VERSION.SDK_INT < 29 ? new n() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private Intent C(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1278i0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1282m0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1281l0.getSearchActivity());
        return intent;
    }

    private Intent D(Cursor cursor, int i10, String str) {
        int i11;
        String o10;
        try {
            String o11 = s0.o(cursor, "suggest_intent_action");
            if (o11 == null) {
                o11 = this.f1281l0.getSuggestIntentAction();
            }
            if (o11 == null) {
                o11 = "android.intent.action.SEARCH";
            }
            String str2 = o11;
            String o12 = s0.o(cursor, "suggest_intent_data");
            if (o12 == null) {
                o12 = this.f1281l0.getSuggestIntentData();
            }
            if (o12 != null && (o10 = s0.o(cursor, "suggest_intent_data_id")) != null) {
                o12 = o12 + "/" + Uri.encode(o10);
            }
            return C(str2, o12 == null ? null : Uri.parse(o12), s0.o(cursor, "suggest_intent_extra_data"), s0.o(cursor, "suggest_intent_query"), i10, str);
        } catch (RuntimeException e10) {
            try {
                i11 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i11 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e10);
            return null;
        }
    }

    private Intent E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1282m0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent F(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void G() {
        this.f1285p.dismissDropDown();
    }

    private void I(View view, Rect rect) {
        view.getLocationInWindow(this.B);
        getLocationInWindow(this.C);
        int[] iArr = this.B;
        int i10 = iArr[1];
        int[] iArr2 = this.C;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    private CharSequence J(CharSequence charSequence) {
        if (!this.P || this.E == null) {
            return charSequence;
        }
        int textSize = (int) (this.f1285p.getTextSize() * 1.25d);
        this.E.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.E), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean K() {
        SearchableInfo searchableInfo = this.f1281l0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f1281l0.getVoiceSearchLaunchWebSearch()) {
            intent = this.H;
        } else if (this.f1281l0.getVoiceSearchLaunchRecognizer()) {
            intent = this.I;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, Constants.MIN_PROGRESS_STEP) == null) ? false : true;
    }

    static boolean M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean N() {
        return (this.S || this.f1276g0) && !L();
    }

    private void O(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e10) {
            Log.e("SearchView", "Failed launch activity: " + intent, e10);
        }
    }

    private boolean Q(int i10, int i11, String str) {
        Cursor d10 = this.R.d();
        if (d10 == null || !d10.moveToPosition(i10)) {
            return false;
        }
        O(D(d10, i11, str));
        return true;
    }

    private void b0() {
        post(this.f1283n0);
    }

    private void c0(int i10) {
        Editable text = this.f1285p.getText();
        Cursor d10 = this.R.d();
        if (d10 == null) {
            return;
        }
        if (d10.moveToPosition(i10)) {
            CharSequence b10 = this.R.b(d10);
            if (b10 != null) {
                setQuery(b10);
                return;
            } else {
                setQuery(text);
                return;
            }
        }
        setQuery(text);
    }

    private void e0() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f1285p.getText());
        if (!z11 && (!this.P || this.f1279j0)) {
            z10 = false;
        }
        this.f1297v.setVisibility(z10 ? 0 : 8);
        Drawable drawable = this.f1297v.getDrawable();
        if (drawable != null) {
            drawable.setState(z11 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1285p;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(d.d.f28696g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(d.d.f28697h);
    }

    private void h0() {
        this.f1285p.setThreshold(this.f1281l0.getSuggestThreshold());
        this.f1285p.setImeOptions(this.f1281l0.getImeOptions());
        int inputType = this.f1281l0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1281l0.getSuggestAuthority() != null) {
                inputType = inputType | Constants.MIN_PROGRESS_STEP | 524288;
            }
        }
        this.f1285p.setInputType(inputType);
        l0.a aVar = this.R;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f1281l0.getSuggestAuthority() != null) {
            s0 s0Var = new s0(getContext(), this, this.f1281l0, this.f1286p0);
            this.R = s0Var;
            this.f1285p.setAdapter(s0Var);
            ((s0) this.R).x(this.U ? 2 : 1);
        }
    }

    private void i0() {
        this.f1291s.setVisibility((N() && (this.f1295u.getVisibility() == 0 || this.f1299w.getVisibility() == 0)) ? 0 : 8);
    }

    private void j0(boolean z10) {
        this.f1295u.setVisibility((this.S && N() && hasFocus() && (z10 || !this.f1276g0)) ? 0 : 8);
    }

    private void k0(boolean z10) {
        this.Q = z10;
        int i10 = 0;
        int i11 = z10 ? 0 : 8;
        boolean z11 = !TextUtils.isEmpty(this.f1285p.getText());
        this.f1293t.setVisibility(i11);
        j0(z11);
        this.f1287q.setVisibility(z10 ? 8 : 0);
        this.D.setVisibility((this.D.getDrawable() == null || this.P) ? 8 : 8);
        e0();
        l0(!z11);
        i0();
    }

    private void l0(boolean z10) {
        int i10 = 8;
        if (this.f1276g0 && !L() && z10) {
            this.f1295u.setVisibility(8);
            i10 = 0;
        }
        this.f1299w.setVisibility(i10);
    }

    private void setQuery(CharSequence charSequence) {
        this.f1285p.setText(charSequence);
        this.f1285p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    void B() {
        int i10;
        if (this.f1300x.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1289r.getPaddingLeft();
            Rect rect = new Rect();
            boolean b10 = g1.b(this);
            int dimensionPixelSize = this.P ? resources.getDimensionPixelSize(d.d.f28694e) + resources.getDimensionPixelSize(d.d.f28695f) : 0;
            this.f1285p.getDropDownBackground().getPadding(rect);
            if (b10) {
                i10 = -rect.left;
            } else {
                i10 = paddingLeft - (rect.left + dimensionPixelSize);
            }
            this.f1285p.setDropDownHorizontalOffset(i10);
            this.f1285p.setDropDownWidth((((this.f1300x.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    void H() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1285p.refreshAutoCompleteResults();
            return;
        }
        n nVar = f1275w0;
        nVar.b(this.f1285p);
        nVar.a(this.f1285p);
    }

    public boolean L() {
        return this.Q;
    }

    void P(int i10, String str, String str2) {
        getContext().startActivity(C("android.intent.action.SEARCH", null, null, str2, i10, str));
    }

    void R() {
        if (TextUtils.isEmpty(this.f1285p.getText())) {
            if (this.P) {
                k kVar = this.L;
                if (kVar == null || !kVar.a()) {
                    clearFocus();
                    k0(true);
                    return;
                }
                return;
            }
            return;
        }
        this.f1285p.setText("");
        this.f1285p.requestFocus();
        this.f1285p.setImeVisibility(true);
    }

    boolean S(int i10, int i11, String str) {
        m mVar = this.N;
        if (mVar == null || !mVar.b(i10)) {
            Q(i10, 0, null);
            this.f1285p.setImeVisibility(false);
            G();
            return true;
        }
        return false;
    }

    boolean T(int i10) {
        m mVar = this.N;
        if (mVar == null || !mVar.a(i10)) {
            c0(i10);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void V() {
        k0(false);
        this.f1285p.requestFocus();
        this.f1285p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.O;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void W() {
        Editable text = this.f1285p.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        l lVar = this.K;
        if (lVar == null || !lVar.b(text.toString())) {
            if (this.f1281l0 != null) {
                P(0, null, text.toString());
            }
            this.f1285p.setImeVisibility(false);
            G();
        }
    }

    boolean X(View view, int i10, KeyEvent keyEvent) {
        if (this.f1281l0 != null && this.R != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return S(this.f1285p.getListSelection(), 0, null);
            }
            if (i10 == 21 || i10 == 22) {
                this.f1285p.setSelection(i10 == 21 ? 0 : this.f1285p.length());
                this.f1285p.setListSelection(0);
                this.f1285p.clearListSelection();
                this.f1285p.b();
                return true;
            } else if (i10 == 19) {
                this.f1285p.getListSelection();
                return false;
            }
        }
        return false;
    }

    void Y(CharSequence charSequence) {
        Editable text = this.f1285p.getText();
        this.f1278i0 = text;
        boolean z10 = !TextUtils.isEmpty(text);
        j0(z10);
        l0(!z10);
        e0();
        i0();
        if (this.K != null && !TextUtils.equals(charSequence, this.f1277h0)) {
            this.K.a(charSequence.toString());
        }
        this.f1277h0 = charSequence.toString();
    }

    void Z() {
        k0(L());
        b0();
        if (this.f1285p.hasFocus()) {
            H();
        }
    }

    void a0() {
        SearchableInfo searchableInfo = this.f1281l0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(F(this.H, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(E(this.I, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    @Override // i.c
    public void b() {
        if (this.f1279j0) {
            return;
        }
        this.f1279j0 = true;
        int imeOptions = this.f1285p.getImeOptions();
        this.f1280k0 = imeOptions;
        this.f1285p.setImeOptions(imeOptions | 33554432);
        this.f1285p.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.V = true;
        super.clearFocus();
        this.f1285p.clearFocus();
        this.f1285p.setImeVisibility(false);
        this.V = false;
    }

    public void d0(CharSequence charSequence, boolean z10) {
        this.f1285p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1285p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1278i0 = charSequence;
        }
        if (!z10 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        W();
    }

    @Override // i.c
    public void e() {
        d0("", false);
        clearFocus();
        k0(true);
        this.f1285p.setImeOptions(this.f1280k0);
        this.f1279j0 = false;
    }

    void f0() {
        int[] iArr = this.f1285p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1289r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1291s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f1285p.getImeOptions();
    }

    public int getInputType() {
        return this.f1285p.getInputType();
    }

    public int getMaxWidth() {
        return this.W;
    }

    public CharSequence getQuery() {
        return this.f1285p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.T;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1281l0;
        if (searchableInfo != null && searchableInfo.getHintId() != 0) {
            return getContext().getText(this.f1281l0.getHintId());
        }
        return this.J;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.G;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.F;
    }

    public l0.a getSuggestionsAdapter() {
        return this.R;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f1283n0);
        post(this.f1284o0);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.k0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            I(this.f1285p, this.f1302z);
            Rect rect = this.A;
            Rect rect2 = this.f1302z;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            o oVar = this.f1301y;
            if (oVar == null) {
                o oVar2 = new o(this.A, this.f1302z, this.f1285p);
                this.f1301y = oVar2;
                setTouchDelegate(oVar2);
                return;
            }
            oVar.a(this.A, this.f1302z);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.k0, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        if (L()) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.W;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.W;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.W) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.c());
        k0(savedState.f1303c);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1303c = L();
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        b0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (!this.V && isFocusable()) {
            if (!L()) {
                boolean requestFocus = this.f1285p.requestFocus(i10, rect);
                if (requestFocus) {
                    k0(false);
                }
                return requestFocus;
            }
            return super.requestFocus(i10, rect);
        }
        return false;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1282m0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            R();
        } else {
            V();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.P == z10) {
            return;
        }
        this.P = z10;
        k0(z10);
        g0();
    }

    public void setImeOptions(int i10) {
        this.f1285p.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f1285p.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.W = i10;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
        this.L = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.M = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
        this.K = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.O = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
        this.N = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.T = charSequence;
        g0();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.U = z10;
        l0.a aVar = this.R;
        if (aVar instanceof s0) {
            ((s0) aVar).x(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1281l0 = searchableInfo;
        if (searchableInfo != null) {
            h0();
            g0();
        }
        boolean K = K();
        this.f1276g0 = K;
        if (K) {
            this.f1285p.setPrivateImeOptions("nm");
        }
        k0(L());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.S = z10;
        k0(L());
    }

    public void setSuggestionsAdapter(l0.a aVar) {
        this.R = aVar;
        this.f1285p.setAdapter(aVar);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.a.H);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1302z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.C = new int[2];
        this.f1283n0 = new b();
        this.f1284o0 = new c();
        this.f1286p0 = new WeakHashMap<>();
        f fVar = new f();
        this.f1288q0 = fVar;
        this.f1290r0 = new g();
        h hVar = new h();
        this.f1292s0 = hVar;
        i iVar = new i();
        this.f1294t0 = iVar;
        j jVar = new j();
        this.f1296u0 = jVar;
        this.f1298v0 = new a();
        int[] iArr = d.j.Z1;
        z0 v10 = z0.v(context, attributeSet, iArr, i10, 0);
        androidx.core.view.z.o0(this, context, iArr, attributeSet, v10.r(), i10, 0);
        LayoutInflater.from(context).inflate(v10.n(d.j.f28843j2, d.g.f28774r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(d.f.D);
        this.f1285p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1287q = findViewById(d.f.f28756z);
        View findViewById = findViewById(d.f.C);
        this.f1289r = findViewById;
        View findViewById2 = findViewById(d.f.J);
        this.f1291s = findViewById2;
        ImageView imageView = (ImageView) findViewById(d.f.f28754x);
        this.f1293t = imageView;
        ImageView imageView2 = (ImageView) findViewById(d.f.A);
        this.f1295u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(d.f.f28755y);
        this.f1297v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(d.f.E);
        this.f1299w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(d.f.B);
        this.D = imageView5;
        androidx.core.view.z.u0(findViewById, v10.g(d.j.f28848k2));
        androidx.core.view.z.u0(findViewById2, v10.g(d.j.f28868o2));
        int i11 = d.j.f28863n2;
        imageView.setImageDrawable(v10.g(i11));
        imageView2.setImageDrawable(v10.g(d.j.f28833h2));
        imageView3.setImageDrawable(v10.g(d.j.f28818e2));
        imageView4.setImageDrawable(v10.g(d.j.f28878q2));
        imageView5.setImageDrawable(v10.g(i11));
        this.E = v10.g(d.j.f28858m2);
        c1.a(imageView, getResources().getString(d.h.f28790n));
        this.F = v10.n(d.j.f28873p2, d.g.f28773q);
        this.G = v10.n(d.j.f28823f2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f1298v0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f1290r0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(v10.a(d.j.f28838i2, true));
        int f10 = v10.f(d.j.f28803b2, -1);
        if (f10 != -1) {
            setMaxWidth(f10);
        }
        this.J = v10.p(d.j.f28828g2);
        this.T = v10.p(d.j.f28853l2);
        int k10 = v10.k(d.j.f28813d2, -1);
        if (k10 != -1) {
            setImeOptions(k10);
        }
        int k11 = v10.k(d.j.f28808c2, -1);
        if (k11 != -1) {
            setInputType(k11);
        }
        setFocusable(v10.a(d.j.f28798a2, true));
        v10.w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.I = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1300x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        k0(this.P);
        g0();
    }
}
