package com.facebook.react.bridge;

import g6.a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@a
/* loaded from: classes.dex */
public class ReactMarker {
    private static final List<MarkerListener> sListeners = new CopyOnWriteArrayList();
    private static final List<FabricMarkerListener> sFabricMarkerListeners = new CopyOnWriteArrayList();

    /* loaded from: classes.dex */
    public interface FabricMarkerListener {
        void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i10, long j10);
    }

    /* loaded from: classes.dex */
    public interface MarkerListener {
        void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i10);
    }

    @a
    public static void addFabricListener(FabricMarkerListener fabricMarkerListener) {
        List<FabricMarkerListener> list = sFabricMarkerListeners;
        if (list.contains(fabricMarkerListener)) {
            return;
        }
        list.add(fabricMarkerListener);
    }

    @a
    public static void addListener(MarkerListener markerListener) {
        List<MarkerListener> list = sListeners;
        if (list.contains(markerListener)) {
            return;
        }
        list.add(markerListener);
    }

    @a
    public static void clearFabricMarkerListeners() {
        sFabricMarkerListeners.clear();
    }

    @a
    public static void clearMarkerListeners() {
        sListeners.clear();
    }

    @a
    public static void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i10, long j10) {
        for (FabricMarkerListener fabricMarkerListener : sFabricMarkerListeners) {
            fabricMarkerListener.logFabricMarker(reactMarkerConstants, str, i10, j10);
        }
    }

    @a
    public static void logMarker(String str) {
        logMarker(str, (String) null);
    }

    @a
    public static void removeFabricListener(FabricMarkerListener fabricMarkerListener) {
        sFabricMarkerListeners.remove(fabricMarkerListener);
    }

    @a
    public static void removeListener(MarkerListener markerListener) {
        sListeners.remove(markerListener);
    }

    @a
    public static void logMarker(String str, int i10) {
        logMarker(str, (String) null, i10);
    }

    @a
    public static void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i10) {
        logFabricMarker(reactMarkerConstants, str, i10, -1L);
    }

    @a
    public static void logMarker(String str, String str2) {
        logMarker(str, str2, 0);
    }

    @a
    public static void logMarker(String str, String str2, int i10) {
        logMarker(ReactMarkerConstants.valueOf(str), str2, i10);
    }

    @a
    public static void logMarker(ReactMarkerConstants reactMarkerConstants) {
        logMarker(reactMarkerConstants, (String) null, 0);
    }

    @a
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, int i10) {
        logMarker(reactMarkerConstants, (String) null, i10);
    }

    @a
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, String str) {
        logMarker(reactMarkerConstants, str, 0);
    }

    @a
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i10) {
        logFabricMarker(reactMarkerConstants, str, i10);
        for (MarkerListener markerListener : sListeners) {
            markerListener.logMarker(reactMarkerConstants, str, i10);
        }
    }
}
