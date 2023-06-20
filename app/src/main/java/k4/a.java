package k4;

import android.graphics.Color;
import com.facebook.react.fabric.FabricUIManager;

/* compiled from: ReactDebugOverlayTags.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final i4.a f33144a;

    /* renamed from: b  reason: collision with root package name */
    public static final i4.a f33145b;

    /* renamed from: c  reason: collision with root package name */
    public static final i4.a f33146c;

    /* renamed from: d  reason: collision with root package name */
    public static final i4.a f33147d;

    /* renamed from: e  reason: collision with root package name */
    public static final i4.a f33148e;

    static {
        new i4.a("Performance", "Markers for Performance", -16711936);
        new i4.a("Navigation", "Tag for navigation", Color.rgb(156, 39, 176));
        f33144a = new i4.a("RN Core", "Tag for React Native Core", -16777216);
        f33145b = new i4.a("Bridge Calls", "JS to Java calls (warning: this is spammy)", -65281);
        f33146c = new i4.a("Native Module", "Native Module init", Color.rgb(128, 0, 128));
        f33147d = new i4.a("UI Manager", "UI Manager View Operations (requires restart\nwarning: this is spammy)", -16711681);
        f33148e = new i4.a(FabricUIManager.TAG, "Fabric UI Manager View Operations", -16711681);
        new i4.a("FabricReconciler", "Reconciler for Fabric", -16711681);
        new i4.a("Relay", "including prefetching", Color.rgb(255, 153, 0));
    }
}
