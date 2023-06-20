package com.facebook.react.uimanager;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableMap;
import i0.c;
import java.util.HashMap;

/* compiled from: ReactAccessibilityDelegate.java */
/* loaded from: classes.dex */
public class t extends androidx.core.view.a {

    /* renamed from: g  reason: collision with root package name */
    private static int f15945g = 1056964608;

    /* renamed from: h  reason: collision with root package name */
    public static final HashMap<String, Integer> f15946h;

    /* renamed from: f  reason: collision with root package name */
    View f15949f;

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<Integer, String> f15948e = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private Handler f15947d = new a(this);

    /* compiled from: ReactAccessibilityDelegate.java */
    /* loaded from: classes.dex */
    class a extends Handler {
        a(t tVar) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ((View) message.obj).sendAccessibilityEvent(4);
        }
    }

    /* compiled from: ReactAccessibilityDelegate.java */
    /* loaded from: classes.dex */
    class b extends com.facebook.react.uimanager.events.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WritableMap f15950a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(t tVar, int i10, int i11, WritableMap writableMap) {
            super(i10, i11);
            this.f15950a = writableMap;
        }

        @Override // com.facebook.react.uimanager.events.c
        protected WritableMap getEventData() {
            return this.f15950a;
        }

        @Override // com.facebook.react.uimanager.events.c
        public String getEventName() {
            return "topAccessibilityAction";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactAccessibilityDelegate.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15951a;

        static {
            int[] iArr = new int[d.values().length];
            f15951a = iArr;
            try {
                iArr[d.BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15951a[d.TOGGLEBUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15951a[d.SEARCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15951a[d.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15951a[d.IMAGEBUTTON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15951a[d.KEYBOARDKEY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15951a[d.TEXT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15951a[d.ADJUSTABLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15951a[d.CHECKBOX.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15951a[d.RADIO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15951a[d.SPINBUTTON.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f15951a[d.SWITCH.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f15951a[d.LIST.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f15951a[d.NONE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f15951a[d.LINK.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f15951a[d.SUMMARY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f15951a[d.HEADER.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f15951a[d.ALERT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f15951a[d.COMBOBOX.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f15951a[d.MENU.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f15951a[d.MENUBAR.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f15951a[d.MENUITEM.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f15951a[d.PROGRESSBAR.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f15951a[d.RADIOGROUP.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f15951a[d.SCROLLBAR.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f15951a[d.TAB.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f15951a[d.TABLIST.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f15951a[d.TIMER.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f15951a[d.TOOLBAR.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    /* compiled from: ReactAccessibilityDelegate.java */
    /* loaded from: classes.dex */
    public enum d {
        NONE,
        BUTTON,
        TOGGLEBUTTON,
        LINK,
        SEARCH,
        IMAGE,
        IMAGEBUTTON,
        KEYBOARDKEY,
        TEXT,
        ADJUSTABLE,
        SUMMARY,
        HEADER,
        ALERT,
        CHECKBOX,
        COMBOBOX,
        MENU,
        MENUBAR,
        MENUITEM,
        PROGRESSBAR,
        RADIO,
        RADIOGROUP,
        SCROLLBAR,
        SPINBUTTON,
        SWITCH,
        TAB,
        TABLIST,
        TIMER,
        LIST,
        TOOLBAR;

        public static d a(String str) {
            d[] values;
            for (d dVar : values()) {
                if (dVar.name().equalsIgnoreCase(str)) {
                    return dVar;
                }
            }
            throw new IllegalArgumentException("Invalid accessibility role value: " + str);
        }

        public static String b(d dVar) {
            switch (c.f15951a[dVar.ordinal()]) {
                case 1:
                    return "android.widget.Button";
                case 2:
                    return "android.widget.ToggleButton";
                case 3:
                    return "android.widget.EditText";
                case 4:
                    return "android.widget.ImageView";
                case 5:
                    return "android.widget.ImageButon";
                case 6:
                    return "android.inputmethodservice.Keyboard$Key";
                case 7:
                    return "android.widget.TextView";
                case 8:
                    return "android.widget.SeekBar";
                case 9:
                    return "android.widget.CheckBox";
                case 10:
                    return "android.widget.RadioButton";
                case 11:
                    return "android.widget.SpinButton";
                case 12:
                    return "android.widget.Switch";
                case 13:
                    return "android.widget.AbsListView";
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    return "android.view.View";
                default:
                    throw new IllegalArgumentException("Invalid accessibility role value: " + dVar);
            }
        }
    }

    static {
        HashMap<String, Integer> hashMap = new HashMap<>();
        f15946h = hashMap;
        hashMap.put("activate", Integer.valueOf(c.a.f31492g.b()));
        hashMap.put("longpress", Integer.valueOf(c.a.f31493h.b()));
        hashMap.put("increment", Integer.valueOf(c.a.f31494i.b()));
        hashMap.put("decrement", Integer.valueOf(c.a.f31495j.b()));
    }

    private void n(View view) {
        if (this.f15947d.hasMessages(1, view)) {
            this.f15947d.removeMessages(1, view);
        }
        this.f15947d.sendMessageDelayed(this.f15947d.obtainMessage(1, view), 200L);
    }

    public static void o(View view) {
        if (androidx.core.view.z.O(view)) {
            return;
        }
        if (view.getTag(com.facebook.react.g.f15399d) == null && view.getTag(com.facebook.react.g.f15400e) == null && view.getTag(com.facebook.react.g.f15396a) == null && view.getTag(com.facebook.react.g.f15406k) == null) {
            return;
        }
        androidx.core.view.z.q0(view, new t());
    }

    public static void p(i0.c cVar, d dVar, Context context) {
        if (dVar == null) {
            dVar = d.NONE;
        }
        cVar.a0(d.b(dVar));
        if (dVar.equals(d.LINK)) {
            cVar.t0(context.getString(com.facebook.react.h.f15412e));
            if (cVar.r() != null) {
                SpannableString spannableString = new SpannableString(cVar.r());
                spannableString.setSpan(new URLSpan(""), 0, spannableString.length(), 0);
                cVar.e0(spannableString);
            }
            if (cVar.w() != null) {
                SpannableString spannableString2 = new SpannableString(cVar.w());
                spannableString2.setSpan(new URLSpan(""), 0, spannableString2.length(), 0);
                cVar.B0(spannableString2);
            }
        } else if (dVar.equals(d.IMAGE)) {
            cVar.t0(context.getString(com.facebook.react.h.f15410c));
        } else if (dVar.equals(d.IMAGEBUTTON)) {
            cVar.t0(context.getString(com.facebook.react.h.f15411d));
            cVar.b0(true);
        } else if (dVar.equals(d.BUTTON)) {
            cVar.b0(true);
        } else if (dVar.equals(d.TOGGLEBUTTON)) {
            cVar.b0(true);
            cVar.Y(true);
        } else if (dVar.equals(d.SUMMARY)) {
            cVar.t0(context.getString(com.facebook.react.h.f15428u));
        } else if (dVar.equals(d.HEADER)) {
            cVar.d0(c.C0402c.a(0, 1, 0, 1, true));
        } else if (dVar.equals(d.ALERT)) {
            cVar.t0(context.getString(com.facebook.react.h.f15408a));
        } else if (dVar.equals(d.COMBOBOX)) {
            cVar.t0(context.getString(com.facebook.react.h.f15409b));
        } else if (dVar.equals(d.MENU)) {
            cVar.t0(context.getString(com.facebook.react.h.f15413f));
        } else if (dVar.equals(d.MENUBAR)) {
            cVar.t0(context.getString(com.facebook.react.h.f15414g));
        } else if (dVar.equals(d.MENUITEM)) {
            cVar.t0(context.getString(com.facebook.react.h.f15415h));
        } else if (dVar.equals(d.PROGRESSBAR)) {
            cVar.t0(context.getString(com.facebook.react.h.f15416i));
        } else if (dVar.equals(d.RADIOGROUP)) {
            cVar.t0(context.getString(com.facebook.react.h.f15417j));
        } else if (dVar.equals(d.SCROLLBAR)) {
            cVar.t0(context.getString(com.facebook.react.h.f15419l));
        } else if (dVar.equals(d.SPINBUTTON)) {
            cVar.t0(context.getString(com.facebook.react.h.f15420m));
        } else if (dVar.equals(d.TAB)) {
            cVar.t0(context.getString(com.facebook.react.h.f15418k));
        } else if (dVar.equals(d.TABLIST)) {
            cVar.t0(context.getString(com.facebook.react.h.f15429v));
        } else if (dVar.equals(d.TIMER)) {
            cVar.t0(context.getString(com.facebook.react.h.f15430w));
        } else if (dVar.equals(d.TOOLBAR)) {
            cVar.t0(context.getString(com.facebook.react.h.f15431x));
        }
    }

    private static void q(i0.c cVar, ReadableMap readableMap, Context context) {
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            Dynamic dynamic = readableMap.getDynamic(nextKey);
            if (nextKey.equals("selected") && dynamic.getType() == ReadableType.Boolean) {
                cVar.w0(dynamic.asBoolean());
            } else if (nextKey.equals("disabled") && dynamic.getType() == ReadableType.Boolean) {
                cVar.g0(!dynamic.asBoolean());
            } else if (nextKey.equals("checked") && dynamic.getType() == ReadableType.Boolean) {
                boolean asBoolean = dynamic.asBoolean();
                cVar.Y(true);
                cVar.Z(asBoolean);
                if (cVar.p().equals(d.b(d.SWITCH))) {
                    cVar.B0(context.getString(asBoolean ? com.facebook.react.h.f15426s : com.facebook.react.h.f15425r));
                }
            }
        }
    }

    @Override // androidx.core.view.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        ReadableMap readableMap = (ReadableMap) view.getTag(com.facebook.react.g.f15401f);
        if (readableMap != null && readableMap.hasKey("min") && readableMap.hasKey("now") && readableMap.hasKey("max")) {
            Dynamic dynamic = readableMap.getDynamic("min");
            Dynamic dynamic2 = readableMap.getDynamic("now");
            Dynamic dynamic3 = readableMap.getDynamic("max");
            if (dynamic != null) {
                ReadableType type = dynamic.getType();
                ReadableType readableType = ReadableType.Number;
                if (type == readableType && dynamic2 != null && dynamic2.getType() == readableType && dynamic3 != null && dynamic3.getType() == readableType) {
                    int asInt = dynamic.asInt();
                    int asInt2 = dynamic2.asInt();
                    int asInt3 = dynamic3.asInt();
                    if (asInt3 <= asInt || asInt2 < asInt || asInt3 < asInt2) {
                        return;
                    }
                    accessibilityEvent.setItemCount(asInt3 - asInt);
                    accessibilityEvent.setCurrentItemIndex(asInt2);
                }
            }
        }
    }

    @Override // androidx.core.view.a
    public void g(View view, i0.c cVar) {
        super.g(view, cVar);
        d dVar = (d) view.getTag(com.facebook.react.g.f15399d);
        if (dVar != null) {
            p(cVar, dVar, view.getContext());
        }
        Object tag = view.getTag(com.facebook.react.g.f15402g);
        if (tag != null) {
            View a10 = a7.a.a(view.getRootView(), (String) tag);
            this.f15949f = a10;
            if (a10 != null) {
                cVar.m0(a10);
            }
        }
        ReadableMap readableMap = (ReadableMap) view.getTag(com.facebook.react.g.f15400e);
        if (readableMap != null) {
            q(cVar, readableMap, view.getContext());
        }
        ReadableArray readableArray = (ReadableArray) view.getTag(com.facebook.react.g.f15396a);
        if (readableArray != null) {
            for (int i10 = 0; i10 < readableArray.size(); i10++) {
                ReadableMap map = readableArray.getMap(i10);
                if (map.hasKey("name")) {
                    int i11 = f15945g;
                    String string = map.hasKey("label") ? map.getString("label") : null;
                    HashMap<String, Integer> hashMap = f15946h;
                    if (hashMap.containsKey(map.getString("name"))) {
                        i11 = hashMap.get(map.getString("name")).intValue();
                    } else {
                        f15945g++;
                    }
                    this.f15948e.put(Integer.valueOf(i11), map.getString("name"));
                    cVar.b(new c.a(i11, string));
                } else {
                    throw new IllegalArgumentException("Unknown accessibility action.");
                }
            }
        }
        ReadableMap readableMap2 = (ReadableMap) view.getTag(com.facebook.react.g.f15401f);
        if (readableMap2 != null && readableMap2.hasKey("min") && readableMap2.hasKey("now") && readableMap2.hasKey("max")) {
            Dynamic dynamic = readableMap2.getDynamic("min");
            Dynamic dynamic2 = readableMap2.getDynamic("now");
            Dynamic dynamic3 = readableMap2.getDynamic("max");
            if (dynamic != null) {
                ReadableType type = dynamic.getType();
                ReadableType readableType = ReadableType.Number;
                if (type == readableType && dynamic2 != null && dynamic2.getType() == readableType && dynamic3 != null && dynamic3.getType() == readableType) {
                    int asInt = dynamic.asInt();
                    int asInt2 = dynamic2.asInt();
                    int asInt3 = dynamic3.asInt();
                    if (asInt3 > asInt && asInt2 >= asInt && asInt3 >= asInt2) {
                        cVar.s0(c.d.a(0, asInt, asInt3, asInt2));
                    }
                }
            }
        }
        String str = (String) view.getTag(com.facebook.react.g.f15406k);
        if (str != null) {
            cVar.C0(str);
        }
    }

    @Override // androidx.core.view.a
    public boolean j(View view, int i10, Bundle bundle) {
        if (this.f15948e.containsKey(Integer.valueOf(i10))) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("actionName", this.f15948e.get(Integer.valueOf(i10)));
            ReactContext reactContext = (ReactContext) view.getContext();
            if (reactContext.hasActiveReactInstance()) {
                int id2 = view.getId();
                int e10 = t0.e(reactContext);
                UIManager g10 = t0.g(reactContext, id2);
                if (g10 != null) {
                    ((com.facebook.react.uimanager.events.d) g10.getEventDispatcher()).g(new b(this, e10, id2, createMap));
                }
            } else {
                ReactSoftExceptionLogger.logSoftException("ReactAccessibilityDelegate", new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
            }
            d dVar = (d) view.getTag(com.facebook.react.g.f15399d);
            ReadableMap readableMap = (ReadableMap) view.getTag(com.facebook.react.g.f15401f);
            if (dVar == d.ADJUSTABLE) {
                if (i10 == c.a.f31494i.b() || i10 == c.a.f31495j.b()) {
                    if (readableMap != null && !readableMap.hasKey("text")) {
                        n(view);
                    }
                    return super.j(view, i10, bundle);
                }
                return true;
            }
            return true;
        }
        return super.j(view, i10, bundle);
    }
}
