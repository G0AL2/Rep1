package i;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* compiled from: ContextThemeWrapper.java */
/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private int f31421a;

    /* renamed from: b  reason: collision with root package name */
    private Resources.Theme f31422b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f31423c;

    /* renamed from: d  reason: collision with root package name */
    private Configuration f31424d;

    /* renamed from: e  reason: collision with root package name */
    private Resources f31425e;

    public d() {
        super(null);
    }

    private Resources b() {
        if (this.f31425e == null) {
            Configuration configuration = this.f31424d;
            if (configuration == null) {
                this.f31425e = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                this.f31425e = createConfigurationContext(configuration).getResources();
            } else {
                Resources resources = super.getResources();
                Configuration configuration2 = new Configuration(resources.getConfiguration());
                configuration2.updateFrom(this.f31424d);
                this.f31425e = new Resources(resources.getAssets(), resources.getDisplayMetrics(), configuration2);
            }
        }
        return this.f31425e;
    }

    private void d() {
        boolean z10 = this.f31422b == null;
        if (z10) {
            this.f31422b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f31422b.setTo(theme);
            }
        }
        e(this.f31422b, this.f31421a, z10);
    }

    public void a(Configuration configuration) {
        if (this.f31425e == null) {
            if (this.f31424d == null) {
                this.f31424d = new Configuration(configuration);
                return;
            }
            throw new IllegalStateException("Override configuration has already been set");
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f31421a;
    }

    protected void e(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f31423c == null) {
                this.f31423c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f31423c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f31422b;
        if (theme != null) {
            return theme;
        }
        if (this.f31421a == 0) {
            this.f31421a = d.i.f28794d;
        }
        d();
        return this.f31422b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f31421a != i10) {
            this.f31421a = i10;
            d();
        }
    }

    public d(Context context, int i10) {
        super(context);
        this.f31421a = i10;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f31422b = theme;
    }
}
