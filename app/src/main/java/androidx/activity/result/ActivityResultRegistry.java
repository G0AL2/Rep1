package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* renamed from: a  reason: collision with root package name */
    private Random f710a = new Random();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, String> f711b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    final Map<String, Integer> f712c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, d> f713d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    ArrayList<String> f714e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    final transient Map<String, c<?>> f715f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    final Map<String, Object> f716g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    final Bundle f717h = new Bundle();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes.dex */
    public class a<I> extends androidx.activity.result.b<I> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f722a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f723b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c.a f724c;

        a(String str, int i10, c.a aVar) {
            this.f722a = str;
            this.f723b = i10;
            this.f724c = aVar;
        }

        @Override // androidx.activity.result.b
        public void b(I i10, androidx.core.app.b bVar) {
            ActivityResultRegistry.this.f714e.add(this.f722a);
            Integer num = ActivityResultRegistry.this.f712c.get(this.f722a);
            ActivityResultRegistry.this.f(num != null ? num.intValue() : this.f723b, this.f724c, i10, bVar);
        }

        @Override // androidx.activity.result.b
        public void c() {
            ActivityResultRegistry.this.l(this.f722a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes.dex */
    public class b<I> extends androidx.activity.result.b<I> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f726a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f727b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c.a f728c;

        b(String str, int i10, c.a aVar) {
            this.f726a = str;
            this.f727b = i10;
            this.f728c = aVar;
        }

        @Override // androidx.activity.result.b
        public void b(I i10, androidx.core.app.b bVar) {
            ActivityResultRegistry.this.f714e.add(this.f726a);
            Integer num = ActivityResultRegistry.this.f712c.get(this.f726a);
            ActivityResultRegistry.this.f(num != null ? num.intValue() : this.f727b, this.f728c, i10, bVar);
        }

        @Override // androidx.activity.result.b
        public void c() {
            ActivityResultRegistry.this.l(this.f726a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c<O> {

        /* renamed from: a  reason: collision with root package name */
        final androidx.activity.result.a<O> f730a;

        /* renamed from: b  reason: collision with root package name */
        final c.a<?, O> f731b;

        c(androidx.activity.result.a<O> aVar, c.a<?, O> aVar2) {
            this.f730a = aVar;
            this.f731b = aVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        final i f732a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<m> f733b = new ArrayList<>();

        d(i iVar) {
            this.f732a = iVar;
        }

        void a(m mVar) {
            this.f732a.a(mVar);
            this.f733b.add(mVar);
        }

        void b() {
            Iterator<m> it = this.f733b.iterator();
            while (it.hasNext()) {
                this.f732a.c(it.next());
            }
            this.f733b.clear();
        }
    }

    private void a(int i10, String str) {
        this.f711b.put(Integer.valueOf(i10), str);
        this.f712c.put(str, Integer.valueOf(i10));
    }

    private <O> void d(String str, int i10, Intent intent, c<O> cVar) {
        androidx.activity.result.a<O> aVar;
        if (cVar != null && (aVar = cVar.f730a) != null) {
            aVar.a(cVar.f731b.c(i10, intent));
            return;
        }
        this.f716g.remove(str);
        this.f717h.putParcelable(str, new ActivityResult(i10, intent));
    }

    private int e() {
        int nextInt = this.f710a.nextInt(2147418112);
        while (true) {
            int i10 = nextInt + Constants.MIN_PROGRESS_STEP;
            if (!this.f711b.containsKey(Integer.valueOf(i10))) {
                return i10;
            }
            nextInt = this.f710a.nextInt(2147418112);
        }
    }

    private int k(String str) {
        Integer num = this.f712c.get(str);
        if (num != null) {
            return num.intValue();
        }
        int e10 = e();
        a(e10, str);
        return e10;
    }

    public final boolean b(int i10, int i11, Intent intent) {
        String str = this.f711b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        this.f714e.remove(str);
        d(str, i11, intent, this.f715f.get(str));
        return true;
    }

    public final <O> boolean c(int i10, @SuppressLint({"UnknownNullness"}) O o10) {
        androidx.activity.result.a<?> aVar;
        String str = this.f711b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        this.f714e.remove(str);
        c<?> cVar = this.f715f.get(str);
        if (cVar != null && (aVar = cVar.f730a) != null) {
            aVar.a(o10);
            return true;
        }
        this.f717h.remove(str);
        this.f716g.put(str, o10);
        return true;
    }

    public abstract <I, O> void f(int i10, c.a<I, O> aVar, @SuppressLint({"UnknownNullness"}) I i11, androidx.core.app.b bVar);

    public final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f714e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f710a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.f717h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
            String str = stringArrayList.get(i10);
            if (this.f712c.containsKey(str)) {
                Integer remove = this.f712c.remove(str);
                if (!this.f717h.containsKey(str)) {
                    this.f711b.remove(remove);
                }
            }
            a(integerArrayList.get(i10).intValue(), stringArrayList.get(i10));
        }
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f712c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f712c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f714e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f717h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f710a);
    }

    public final <I, O> androidx.activity.result.b<I> i(final String str, p pVar, final c.a<I, O> aVar, final androidx.activity.result.a<O> aVar2) {
        i lifecycle = pVar.getLifecycle();
        if (!lifecycle.b().a(i.c.STARTED)) {
            int k10 = k(str);
            d dVar = this.f713d.get(str);
            if (dVar == null) {
                dVar = new d(lifecycle);
            }
            dVar.a(new m() { // from class: androidx.activity.result.ActivityResultRegistry.1
                @Override // androidx.lifecycle.m
                public void b(p pVar2, i.b bVar) {
                    if (i.b.ON_START.equals(bVar)) {
                        ActivityResultRegistry.this.f715f.put(str, new c<>(aVar2, aVar));
                        if (ActivityResultRegistry.this.f716g.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.f716g.get(str);
                            ActivityResultRegistry.this.f716g.remove(str);
                            aVar2.a(obj);
                        }
                        ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.f717h.getParcelable(str);
                        if (activityResult != null) {
                            ActivityResultRegistry.this.f717h.remove(str);
                            aVar2.a(aVar.c(activityResult.e(), activityResult.c()));
                        }
                    } else if (i.b.ON_STOP.equals(bVar)) {
                        ActivityResultRegistry.this.f715f.remove(str);
                    } else if (i.b.ON_DESTROY.equals(bVar)) {
                        ActivityResultRegistry.this.l(str);
                    }
                }
            });
            this.f713d.put(str, dVar);
            return new a(str, k10, aVar);
        }
        throw new IllegalStateException("LifecycleOwner " + pVar + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> androidx.activity.result.b<I> j(String str, c.a<I, O> aVar, androidx.activity.result.a<O> aVar2) {
        int k10 = k(str);
        this.f715f.put(str, new c<>(aVar2, aVar));
        if (this.f716g.containsKey(str)) {
            Object obj = this.f716g.get(str);
            this.f716g.remove(str);
            aVar2.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f717h.getParcelable(str);
        if (activityResult != null) {
            this.f717h.remove(str);
            aVar2.a(aVar.c(activityResult.e(), activityResult.c()));
        }
        return new b(str, k10, aVar);
    }

    final void l(String str) {
        Integer remove;
        if (!this.f714e.contains(str) && (remove = this.f712c.remove(str)) != null) {
            this.f711b.remove(remove);
        }
        this.f715f.remove(str);
        if (this.f716g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f716g.get(str));
            this.f716g.remove(str);
        }
        if (this.f717h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f717h.getParcelable(str));
            this.f717h.remove(str);
        }
        d dVar = this.f713d.get(str);
        if (dVar != null) {
            dVar.b();
            this.f713d.remove(str);
        }
    }
}
