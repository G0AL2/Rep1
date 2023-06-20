package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.l;
import java.util.ArrayList;
import java.util.List;
import o1.u;
import o1.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ConstraintsCommandHandler.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: e  reason: collision with root package name */
    private static final String f4491e = l.i("ConstraintsCmdHandler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f4492a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4493b;

    /* renamed from: c  reason: collision with root package name */
    private final g f4494c;

    /* renamed from: d  reason: collision with root package name */
    private final l1.e f4495d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, int i10, g gVar) {
        this.f4492a = context;
        this.f4493b = i10;
        this.f4494c = gVar;
        this.f4495d = new l1.e(gVar.g().r(), (l1.c) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        List<u> d10 = this.f4494c.g().s().h().d();
        ConstraintProxy.a(this.f4492a, d10);
        this.f4495d.a(d10);
        ArrayList<u> arrayList = new ArrayList(d10.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (u uVar : d10) {
            String str = uVar.f34905a;
            if (currentTimeMillis >= uVar.c() && (!uVar.h() || this.f4495d.d(str))) {
                arrayList.add(uVar);
            }
        }
        for (u uVar2 : arrayList) {
            String str2 = uVar2.f34905a;
            Intent b10 = b.b(this.f4492a, x.a(uVar2));
            l e10 = l.e();
            String str3 = f4491e;
            e10.a(str3, "Creating a delay_met command for workSpec with id (" + str2 + ")");
            this.f4494c.f().a().execute(new g.b(this.f4494c, b10, this.f4493b));
        }
        this.f4495d.reset();
    }
}
