package s7;

import android.content.Context;
import com.google.android.ads.mediationtestsuite.dataobjects.ConfigurationItem;
import java.util.List;
import r7.f;

/* compiled from: ConfigurationItemsFragmentViewModel.java */
/* loaded from: classes2.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final List<ConfigurationItem> f36770a;

    /* renamed from: b  reason: collision with root package name */
    private final f.a f36771b;

    /* renamed from: c  reason: collision with root package name */
    private final int f36772c;

    public e(List<ConfigurationItem> list, f.a aVar, int i10) {
        this.f36770a = list;
        this.f36771b = aVar;
        this.f36772c = i10;
    }

    public List<ConfigurationItem> a() {
        return this.f36770a;
    }

    public String b(Context context) {
        return context.getResources().getString(this.f36772c);
    }

    public f.a c() {
        return this.f36771b;
    }
}
