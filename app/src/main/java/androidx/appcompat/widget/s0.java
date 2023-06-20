package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.sdk.AppLovinEventTypes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: SuggestionsAdapter.java */
/* loaded from: classes.dex */
class s0 extends l0.c implements View.OnClickListener {

    /* renamed from: l  reason: collision with root package name */
    private final SearchView f1683l;

    /* renamed from: m  reason: collision with root package name */
    private final SearchableInfo f1684m;

    /* renamed from: n  reason: collision with root package name */
    private final Context f1685n;

    /* renamed from: o  reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f1686o;

    /* renamed from: p  reason: collision with root package name */
    private final int f1687p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f1688q;

    /* renamed from: r  reason: collision with root package name */
    private int f1689r;

    /* renamed from: s  reason: collision with root package name */
    private ColorStateList f1690s;

    /* renamed from: t  reason: collision with root package name */
    private int f1691t;

    /* renamed from: u  reason: collision with root package name */
    private int f1692u;

    /* renamed from: v  reason: collision with root package name */
    private int f1693v;

    /* renamed from: w  reason: collision with root package name */
    private int f1694w;

    /* renamed from: x  reason: collision with root package name */
    private int f1695x;

    /* renamed from: y  reason: collision with root package name */
    private int f1696y;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SuggestionsAdapter.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f1697a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f1698b;

        /* renamed from: c  reason: collision with root package name */
        public final ImageView f1699c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f1700d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f1701e;

        public a(View view) {
            this.f1697a = (TextView) view.findViewById(16908308);
            this.f1698b = (TextView) view.findViewById(16908309);
            this.f1699c = (ImageView) view.findViewById(16908295);
            this.f1700d = (ImageView) view.findViewById(16908296);
            this.f1701e = (ImageView) view.findViewById(d.f.f28747q);
        }
    }

    public s0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f1688q = false;
        this.f1689r = 1;
        this.f1691t = -1;
        this.f1692u = -1;
        this.f1693v = -1;
        this.f1694w = -1;
        this.f1695x = -1;
        this.f1696y = -1;
        this.f1683l = searchView;
        this.f1684m = searchableInfo;
        this.f1687p = searchView.getSuggestionCommitIconResId();
        this.f1685n = context;
        this.f1686o = weakHashMap;
    }

    private void A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1686o.put(str, drawable.getConstantState());
        }
    }

    private void B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    private Drawable k(String str) {
        Drawable.ConstantState constantState = this.f1686o.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence l(CharSequence charSequence) {
        if (this.f1690s == null) {
            TypedValue typedValue = new TypedValue();
            this.f1685n.getTheme().resolveAttribute(d.a.L, typedValue, true);
            this.f1690s = this.f1685n.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1690s, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable m(ComponentName componentName) {
        PackageManager packageManager = this.f1685n.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable == null) {
                Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
                return null;
            }
            return drawable;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("SuggestionsAdapter", e10.toString());
            return null;
        }
    }

    private Drawable n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (this.f1686o.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState = this.f1686o.get(flattenToShortString);
            if (constantState == null) {
                return null;
            }
            return constantState.newDrawable(this.f1685n.getResources());
        }
        Drawable m10 = m(componentName);
        this.f1686o.put(flattenToShortString, m10 != null ? m10.getConstantState() : null);
        return m10;
    }

    public static String o(Cursor cursor, String str) {
        return w(cursor, cursor.getColumnIndex(str));
    }

    private Drawable p() {
        Drawable n10 = n(this.f1684m.getSearchActivity());
        return n10 != null ? n10 : this.f1685n.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable q(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f1685n.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                try {
                    openInputStream.close();
                } catch (IOException e10) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e10);
                }
                return createFromStream;
            }
            throw new FileNotFoundException("Failed to open " + uri);
        } catch (FileNotFoundException e11) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e11.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e11.getMessage());
        return null;
    }

    private Drawable s(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1685n.getPackageName() + "/" + parseInt;
            Drawable k10 = k(str2);
            if (k10 != null) {
                return k10;
            }
            Drawable f10 = androidx.core.content.b.f(this.f1685n, parseInt);
            A(str2, f10);
            return f10;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable k11 = k(str);
            if (k11 != null) {
                return k11;
            }
            Drawable q10 = q(Uri.parse(str));
            A(str, q10);
            return q10;
        }
    }

    private Drawable t(Cursor cursor) {
        int i10 = this.f1694w;
        if (i10 == -1) {
            return null;
        }
        Drawable s10 = s(cursor.getString(i10));
        return s10 != null ? s10 : p();
    }

    private Drawable u(Cursor cursor) {
        int i10 = this.f1695x;
        if (i10 == -1) {
            return null;
        }
        return s(cursor.getString(i10));
    }

    private static String w(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    private void y(ImageView imageView, Drawable drawable, int i10) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i10);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    @Override // l0.a, l0.b.a
    public void a(Cursor cursor) {
        if (this.f1688q) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f1691t = cursor.getColumnIndex("suggest_text_1");
                this.f1692u = cursor.getColumnIndex("suggest_text_2");
                this.f1693v = cursor.getColumnIndex("suggest_text_2_url");
                this.f1694w = cursor.getColumnIndex("suggest_icon_1");
                this.f1695x = cursor.getColumnIndex("suggest_icon_2");
                this.f1696y = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // l0.a, l0.b.a
    public CharSequence b(Cursor cursor) {
        String o10;
        String o11;
        if (cursor == null) {
            return null;
        }
        String o12 = o(cursor, "suggest_intent_query");
        if (o12 != null) {
            return o12;
        }
        if (!this.f1684m.shouldRewriteQueryFromData() || (o11 = o(cursor, "suggest_intent_data")) == null) {
            if (!this.f1684m.shouldRewriteQueryFromText() || (o10 = o(cursor, "suggest_text_1")) == null) {
                return null;
            }
            return o10;
        }
        return o11;
    }

    @Override // l0.b.a
    public Cursor c(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f1683l.getVisibility() == 0 && this.f1683l.getWindowVisibility() == 0) {
            try {
                Cursor v10 = v(this.f1684m, charSequence2, 50);
                if (v10 != null) {
                    v10.getCount();
                    return v10;
                }
            } catch (RuntimeException e10) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e10);
            }
        }
        return null;
    }

    @Override // l0.a
    public void e(View view, Context context, Cursor cursor) {
        CharSequence w10;
        a aVar = (a) view.getTag();
        int i10 = this.f1696y;
        int i11 = i10 != -1 ? cursor.getInt(i10) : 0;
        if (aVar.f1697a != null) {
            z(aVar.f1697a, w(cursor, this.f1691t));
        }
        if (aVar.f1698b != null) {
            String w11 = w(cursor, this.f1693v);
            if (w11 != null) {
                w10 = l(w11);
            } else {
                w10 = w(cursor, this.f1692u);
            }
            if (TextUtils.isEmpty(w10)) {
                TextView textView = aVar.f1697a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1697a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1697a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1697a.setMaxLines(1);
                }
            }
            z(aVar.f1698b, w10);
        }
        ImageView imageView = aVar.f1699c;
        if (imageView != null) {
            y(imageView, t(cursor), 4);
        }
        ImageView imageView2 = aVar.f1700d;
        if (imageView2 != null) {
            y(imageView2, u(cursor), 8);
        }
        int i12 = this.f1689r;
        if (i12 != 2 && (i12 != 1 || (i11 & 1) == 0)) {
            aVar.f1701e.setVisibility(8);
            return;
        }
        aVar.f1701e.setVisibility(0);
        aVar.f1701e.setTag(aVar.f1697a.getText());
        aVar.f1701e.setOnClickListener(this);
    }

    @Override // l0.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View g10 = g(this.f1685n, d(), viewGroup);
            if (g10 != null) {
                ((a) g10.getTag()).f1697a.setText(e10.toString());
            }
            return g10;
        }
    }

    @Override // l0.a, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View h10 = h(this.f1685n, d(), viewGroup);
            if (h10 != null) {
                ((a) h10.getTag()).f1697a.setText(e10.toString());
            }
            return h10;
        }
    }

    @Override // l0.c, l0.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View h10 = super.h(context, cursor, viewGroup);
        h10.setTag(new a(h10));
        ((ImageView) h10.findViewById(d.f.f28747q)).setImageResource(this.f1687p);
        return h10;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        B(d());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        B(d());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1683l.U((CharSequence) tag);
        }
    }

    Drawable r(Uri uri) throws FileNotFoundException {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f1685n.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        }
        throw new FileNotFoundException("No authority: " + uri);
    }

    Cursor v(SearchableInfo searchableInfo, String str, int i10) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme(AppLovinEventTypes.USER_VIEWED_CONTENT).authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i10 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i10));
        }
        return this.f1685n.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    public void x(int i10) {
        this.f1689r = i10;
    }
}
