package com.facebook.react.animated;

import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.t0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NativeAnimatedNodesManager.java */
/* loaded from: classes.dex */
public class l implements com.facebook.react.uimanager.events.f {

    /* renamed from: e  reason: collision with root package name */
    private final ReactApplicationContext f15284e;

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<com.facebook.react.animated.b> f15280a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<d> f15281b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray<com.facebook.react.animated.b> f15282c = new SparseArray<>();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, List<EventAnimationDriver>> f15283d = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private int f15285f = 0;

    /* renamed from: g  reason: collision with root package name */
    private final List<com.facebook.react.animated.b> f15286g = new LinkedList();

    /* renamed from: h  reason: collision with root package name */
    private boolean f15287h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f15288i = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean f15289j = false;

    /* compiled from: NativeAnimatedNodesManager.java */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f15290a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f15291b;

        a(int i10, l lVar) {
            this.f15290a = i10;
            this.f15291b = lVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            UIManager g10 = t0.g(l.this.f15284e, this.f15290a);
            if (g10 != null) {
                ((com.facebook.react.uimanager.events.d) g10.getEventDispatcher()).f(this.f15291b);
                if (this.f15290a == 2) {
                    l.this.f15287h = true;
                } else {
                    l.this.f15288i = true;
                }
            }
        }
    }

    /* compiled from: NativeAnimatedNodesManager.java */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.facebook.react.uimanager.events.c f15293a;

        b(com.facebook.react.uimanager.events.c cVar) {
            this.f15293a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            l.this.q(this.f15293a);
        }
    }

    public l(ReactApplicationContext reactApplicationContext) {
        this.f15284e = reactApplicationContext;
    }

    private void B(com.facebook.react.animated.b bVar) {
        int i10 = 0;
        while (i10 < this.f15281b.size()) {
            d valueAt = this.f15281b.valueAt(i10);
            if (bVar.equals(valueAt.f15240b)) {
                if (valueAt.f15241c != null) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putBoolean("finished", false);
                    valueAt.f15241c.invoke(createMap);
                }
                this.f15281b.removeAt(i10);
                i10--;
            }
            i10++;
        }
    }

    private void D(List<com.facebook.react.animated.b> list) {
        int i10 = this.f15285f + 1;
        this.f15285f = i10;
        if (i10 == 0) {
            this.f15285f = i10 + 1;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i11 = 0;
        for (com.facebook.react.animated.b bVar : list) {
            int i12 = bVar.f15237c;
            int i13 = this.f15285f;
            if (i12 != i13) {
                bVar.f15237c = i13;
                i11++;
                arrayDeque.add(bVar);
            }
        }
        while (!arrayDeque.isEmpty()) {
            com.facebook.react.animated.b bVar2 = (com.facebook.react.animated.b) arrayDeque.poll();
            if (bVar2.f15235a != null) {
                for (int i14 = 0; i14 < bVar2.f15235a.size(); i14++) {
                    com.facebook.react.animated.b bVar3 = bVar2.f15235a.get(i14);
                    bVar3.f15236b++;
                    int i15 = bVar3.f15237c;
                    int i16 = this.f15285f;
                    if (i15 != i16) {
                        bVar3.f15237c = i16;
                        i11++;
                        arrayDeque.add(bVar3);
                    }
                }
            }
        }
        int i17 = this.f15285f + 1;
        this.f15285f = i17;
        if (i17 == 0) {
            this.f15285f = i17 + 1;
        }
        int i18 = 0;
        for (com.facebook.react.animated.b bVar4 : list) {
            if (bVar4.f15236b == 0) {
                int i19 = bVar4.f15237c;
                int i20 = this.f15285f;
                if (i19 != i20) {
                    bVar4.f15237c = i20;
                    i18++;
                    arrayDeque.add(bVar4);
                }
            }
        }
        int i21 = 0;
        while (!arrayDeque.isEmpty()) {
            com.facebook.react.animated.b bVar5 = (com.facebook.react.animated.b) arrayDeque.poll();
            try {
                bVar5.g();
                if (bVar5 instanceof m) {
                    ((m) bVar5).k();
                }
            } catch (JSApplicationCausedNativeException e10) {
                z3.a.k("NativeAnimatedNodesManager", "Native animation workaround, frame lost as result of race condition", e10);
            }
            if (bVar5 instanceof s) {
                ((s) bVar5).l();
            }
            if (bVar5.f15235a != null) {
                for (int i22 = 0; i22 < bVar5.f15235a.size(); i22++) {
                    com.facebook.react.animated.b bVar6 = bVar5.f15235a.get(i22);
                    int i23 = bVar6.f15236b - 1;
                    bVar6.f15236b = i23;
                    int i24 = bVar6.f15237c;
                    int i25 = this.f15285f;
                    if (i24 != i25 && i23 == 0) {
                        bVar6.f15237c = i25;
                        i18++;
                        arrayDeque.add(bVar6);
                    } else if (i24 == i25) {
                        i21++;
                    }
                }
            }
        }
        if (i11 != i18) {
            if (this.f15289j) {
                return;
            }
            this.f15289j = true;
            z3.a.j("NativeAnimatedNodesManager", "Detected animation cycle or disconnected graph. ");
            for (com.facebook.react.animated.b bVar7 : list) {
                z3.a.j("NativeAnimatedNodesManager", bVar7.e());
            }
            IllegalStateException illegalStateException = new IllegalStateException("Looks like animated nodes graph has " + (i21 > 0 ? "cycles (" + i21 + ")" : "disconnected regions") + ", there are " + i11 + " but toposort visited only " + i18);
            boolean z10 = this.f15287h;
            if (z10 && i21 == 0) {
                ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", new ReactNoCrashSoftException(illegalStateException));
                return;
            } else if (z10) {
                ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", new ReactNoCrashSoftException(illegalStateException));
                return;
            } else {
                throw illegalStateException;
            }
        }
        this.f15289j = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(com.facebook.react.uimanager.events.c cVar) {
        ReactApplicationContext reactApplicationContext;
        UIManager g10;
        if (this.f15283d.isEmpty() || (reactApplicationContext = this.f15284e) == null || (g10 = t0.g(reactApplicationContext, cVar.getUIManagerType())) == null) {
            return;
        }
        String resolveCustomDirectEventName = g10.resolveCustomDirectEventName(cVar.getEventName());
        if (resolveCustomDirectEventName == null) {
            resolveCustomDirectEventName = "";
        }
        Map<String, List<EventAnimationDriver>> map = this.f15283d;
        List<EventAnimationDriver> list = map.get(cVar.getViewTag() + resolveCustomDirectEventName);
        if (list != null) {
            for (EventAnimationDriver eventAnimationDriver : list) {
                B(eventAnimationDriver.mValueNode);
                cVar.dispatch(eventAnimationDriver);
                this.f15286g.add(eventAnimationDriver.mValueNode);
            }
            D(this.f15286g);
            this.f15286g.clear();
        }
    }

    public void A(int i10) {
        for (int i11 = 0; i11 < this.f15281b.size(); i11++) {
            d valueAt = this.f15281b.valueAt(i11);
            if (valueAt.f15242d == i10) {
                if (valueAt.f15241c != null) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putBoolean("finished", false);
                    valueAt.f15241c.invoke(createMap);
                }
                this.f15281b.removeAt(i11);
                return;
            }
        }
    }

    public void C(int i10) {
        com.facebook.react.animated.b bVar = this.f15280a.get(i10);
        if (bVar != null && (bVar instanceof s)) {
            ((s) bVar).m(null);
            return;
        }
        throw new JSApplicationIllegalArgumentException("startListeningToAnimatedNodeValue: Animated node [" + i10 + "] does not exist, or is not a 'value' node");
    }

    @Override // com.facebook.react.uimanager.events.f
    public void a(com.facebook.react.uimanager.events.c cVar) {
        if (UiThreadUtil.isOnUiThread()) {
            q(cVar);
        } else {
            UiThreadUtil.runOnUiThread(new b(cVar));
        }
    }

    public void f(int i10, String str, ReadableMap readableMap) {
        int i11 = readableMap.getInt("animatedValueTag");
        com.facebook.react.animated.b bVar = this.f15280a.get(i11);
        if (bVar != null) {
            if (bVar instanceof s) {
                ReadableArray array = readableMap.getArray("nativeEventPath");
                ArrayList arrayList = new ArrayList(array.size());
                for (int i12 = 0; i12 < array.size(); i12++) {
                    arrayList.add(array.getString(i12));
                }
                EventAnimationDriver eventAnimationDriver = new EventAnimationDriver(arrayList, (s) bVar);
                String str2 = i10 + str;
                if (this.f15283d.containsKey(str2)) {
                    this.f15283d.get(str2).add(eventAnimationDriver);
                    return;
                }
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add(eventAnimationDriver);
                this.f15283d.put(str2, arrayList2);
                return;
            }
            throw new JSApplicationIllegalArgumentException("addAnimatedEventToView: Animated node on view [" + i10 + "] connected to event (" + str + ") should be of type " + s.class.getName());
        }
        throw new JSApplicationIllegalArgumentException("addAnimatedEventToView: Animated node with tag [" + i11 + "] does not exist");
    }

    public void g(int i10, int i11) {
        com.facebook.react.animated.b bVar = this.f15280a.get(i10);
        if (bVar != null) {
            if (bVar instanceof m) {
                ReactApplicationContext reactApplicationContext = this.f15284e;
                if (reactApplicationContext != null) {
                    UIManager i12 = t0.i(reactApplicationContext, i11);
                    if (i12 == null) {
                        ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", new ReactNoCrashSoftException("connectAnimatedNodeToView: Animated node could not be connected to UIManager - uiManager disappeared for tag: " + i11));
                        return;
                    }
                    ((m) bVar).h(i11, i12);
                    this.f15282c.put(i10, bVar);
                    return;
                }
                throw new IllegalStateException("connectAnimatedNodeToView: Animated node could not be connected, no ReactApplicationContext: " + i11);
            }
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodeToView: Animated node connected to view [" + i11 + "] should be of type " + m.class.getName());
        }
        throw new JSApplicationIllegalArgumentException("connectAnimatedNodeToView: Animated node with tag [" + i10 + "] does not exist");
    }

    public void h(int i10, int i11) {
        com.facebook.react.animated.b bVar = this.f15280a.get(i10);
        if (bVar != null) {
            com.facebook.react.animated.b bVar2 = this.f15280a.get(i11);
            if (bVar2 != null) {
                bVar.a(bVar2);
                this.f15282c.put(i11, bVar2);
                return;
            }
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodes: Animated node with tag (child) [" + i11 + "] does not exist");
        }
        throw new JSApplicationIllegalArgumentException("connectAnimatedNodes: Animated node with tag (parent) [" + i10 + "] does not exist");
    }

    public void i(int i10, ReadableMap readableMap) {
        com.facebook.react.animated.b qVar;
        if (this.f15280a.get(i10) == null) {
            String string = readableMap.getString("type");
            if ("style".equals(string)) {
                qVar = new o(readableMap, this);
            } else if (AppMeasurementSdk.ConditionalUserProperty.VALUE.equals(string)) {
                qVar = new s(readableMap);
            } else if ("props".equals(string)) {
                qVar = new m(readableMap, this);
            } else if ("interpolation".equals(string)) {
                qVar = new i(readableMap);
            } else if ("addition".equals(string)) {
                qVar = new com.facebook.react.animated.a(readableMap, this);
            } else if ("subtraction".equals(string)) {
                qVar = new p(readableMap, this);
            } else if ("division".equals(string)) {
                qVar = new g(readableMap, this);
            } else if ("multiplication".equals(string)) {
                qVar = new k(readableMap, this);
            } else if ("modulus".equals(string)) {
                qVar = new j(readableMap, this);
            } else if ("diffclamp".equals(string)) {
                qVar = new f(readableMap, this);
            } else if ("transform".equals(string)) {
                qVar = new r(readableMap, this);
            } else if ("tracking".equals(string)) {
                qVar = new q(readableMap, this);
            } else {
                throw new JSApplicationIllegalArgumentException("Unsupported node type: " + string);
            }
            qVar.f15238d = i10;
            this.f15280a.put(i10, qVar);
            this.f15282c.put(i10, qVar);
            return;
        }
        throw new JSApplicationIllegalArgumentException("createAnimatedNode: Animated node [" + i10 + "] already exists");
    }

    public void j(int i10, int i11) {
        com.facebook.react.animated.b bVar = this.f15280a.get(i10);
        if (bVar != null) {
            if (bVar instanceof m) {
                ((m) bVar).i(i11);
                return;
            }
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodeFromView: Animated node connected to view [" + i11 + "] should be of type " + m.class.getName());
        }
        throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodeFromView: Animated node with tag [" + i10 + "] does not exist");
    }

    public void k(int i10, int i11) {
        com.facebook.react.animated.b bVar = this.f15280a.get(i10);
        if (bVar != null) {
            com.facebook.react.animated.b bVar2 = this.f15280a.get(i11);
            if (bVar2 != null) {
                bVar.f(bVar2);
                this.f15282c.put(i11, bVar2);
                return;
            }
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodes: Animated node with tag (child) [" + i11 + "] does not exist");
        }
        throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodes: Animated node with tag (parent) [" + i10 + "] does not exist");
    }

    public void l(int i10) {
        this.f15280a.remove(i10);
        this.f15282c.remove(i10);
    }

    public void m(int i10) {
        com.facebook.react.animated.b bVar = this.f15280a.get(i10);
        if (bVar != null && (bVar instanceof s)) {
            ((s) bVar).h();
            return;
        }
        throw new JSApplicationIllegalArgumentException("extractAnimatedNodeOffset: Animated node [" + i10 + "] does not exist, or is not a 'value' node");
    }

    public void n(int i10) {
        com.facebook.react.animated.b bVar = this.f15280a.get(i10);
        if (bVar != null && (bVar instanceof s)) {
            ((s) bVar).i();
            return;
        }
        throw new JSApplicationIllegalArgumentException("flattenAnimatedNodeOffset: Animated node [" + i10 + "] does not exist, or is not a 'value' node");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.facebook.react.animated.b o(int i10) {
        return this.f15280a.get(i10);
    }

    public void p(int i10, Callback callback) {
        com.facebook.react.animated.b bVar = this.f15280a.get(i10);
        if (bVar != null && (bVar instanceof s)) {
            callback.invoke(Double.valueOf(((s) bVar).k()));
            return;
        }
        throw new JSApplicationIllegalArgumentException("getValue: Animated node with tag [" + i10 + "] does not exist or is not a 'value' node");
    }

    public boolean r() {
        return this.f15281b.size() > 0 || this.f15282c.size() > 0;
    }

    public void s(int i10) {
        if (i10 == 2 && this.f15287h) {
            return;
        }
        if (i10 == 1 && this.f15288i) {
            return;
        }
        this.f15284e.runOnUiQueueThread(new a(i10, this));
    }

    public void t(int i10, String str, int i11) {
        String str2 = i10 + str;
        if (this.f15283d.containsKey(str2)) {
            List<EventAnimationDriver> list = this.f15283d.get(str2);
            if (list.size() == 1) {
                this.f15283d.remove(i10 + str);
                return;
            }
            ListIterator<EventAnimationDriver> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                if (listIterator.next().mValueNode.f15238d == i11) {
                    listIterator.remove();
                    return;
                }
            }
        }
    }

    public void u(int i10) {
        com.facebook.react.animated.b bVar = this.f15280a.get(i10);
        if (bVar == null) {
            return;
        }
        if (bVar instanceof m) {
            ((m) bVar).j();
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node connected to view [?] should be of type " + m.class.getName());
    }

    public void v(long j10) {
        UiThreadUtil.assertOnUiThread();
        for (int i10 = 0; i10 < this.f15282c.size(); i10++) {
            this.f15286g.add(this.f15282c.valueAt(i10));
        }
        this.f15282c.clear();
        boolean z10 = false;
        for (int i11 = 0; i11 < this.f15281b.size(); i11++) {
            d valueAt = this.f15281b.valueAt(i11);
            valueAt.b(j10);
            this.f15286g.add(valueAt.f15240b);
            if (valueAt.f15239a) {
                z10 = true;
            }
        }
        D(this.f15286g);
        this.f15286g.clear();
        if (z10) {
            for (int size = this.f15281b.size() - 1; size >= 0; size--) {
                d valueAt2 = this.f15281b.valueAt(size);
                if (valueAt2.f15239a) {
                    if (valueAt2.f15241c != null) {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putBoolean("finished", true);
                        valueAt2.f15241c.invoke(createMap);
                    }
                    this.f15281b.removeAt(size);
                }
            }
        }
    }

    public void w(int i10, double d10) {
        com.facebook.react.animated.b bVar = this.f15280a.get(i10);
        if (bVar != null && (bVar instanceof s)) {
            ((s) bVar).f15334g = d10;
            this.f15282c.put(i10, bVar);
            return;
        }
        throw new JSApplicationIllegalArgumentException("setAnimatedNodeOffset: Animated node [" + i10 + "] does not exist, or is not a 'value' node");
    }

    public void x(int i10, double d10) {
        com.facebook.react.animated.b bVar = this.f15280a.get(i10);
        if (bVar != null && (bVar instanceof s)) {
            B(bVar);
            ((s) bVar).f15333f = d10;
            this.f15282c.put(i10, bVar);
            return;
        }
        throw new JSApplicationIllegalArgumentException("setAnimatedNodeValue: Animated node [" + i10 + "] does not exist, or is not a 'value' node");
    }

    public void y(int i10, int i11, ReadableMap readableMap, Callback callback) {
        d eVar;
        com.facebook.react.animated.b bVar = this.f15280a.get(i11);
        if (bVar != null) {
            if (bVar instanceof s) {
                d dVar = this.f15281b.get(i10);
                if (dVar != null) {
                    dVar.a(readableMap);
                    return;
                }
                String string = readableMap.getString("type");
                if ("frames".equals(string)) {
                    eVar = new h(readableMap);
                } else if ("spring".equals(string)) {
                    eVar = new n(readableMap);
                } else if ("decay".equals(string)) {
                    eVar = new e(readableMap);
                } else {
                    throw new JSApplicationIllegalArgumentException("startAnimatingNode: Unsupported animation type [" + i11 + "]: " + string);
                }
                eVar.f15242d = i10;
                eVar.f15241c = callback;
                eVar.f15240b = (s) bVar;
                this.f15281b.put(i10, eVar);
                return;
            }
            throw new JSApplicationIllegalArgumentException("startAnimatingNode: Animated node [" + i11 + "] should be of type " + s.class.getName());
        }
        throw new JSApplicationIllegalArgumentException("startAnimatingNode: Animated node [" + i11 + "] does not exist");
    }

    public void z(int i10, c cVar) {
        com.facebook.react.animated.b bVar = this.f15280a.get(i10);
        if (bVar != null && (bVar instanceof s)) {
            ((s) bVar).m(cVar);
            return;
        }
        throw new JSApplicationIllegalArgumentException("startListeningToAnimatedNodeValue: Animated node [" + i10 + "] does not exist, or is not a 'value' node");
    }
}
