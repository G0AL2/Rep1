package com.facebook.react.uimanager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UIManagerModuleConstantsHelper.java */
/* loaded from: classes.dex */
public class v0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> a(d1 d1Var) {
        Map<String, Object> b10 = u0.b();
        b10.put("ViewManagerNames", d1Var.a());
        b10.put("LazyViewManagersEnabled", Boolean.TRUE);
        return b10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> b(List<ViewManager> list, Map<String, Object> map, Map<String, Object> map2) {
        Map<String, Object> b10 = u0.b();
        Map<? extends String, ? extends Object> a10 = u0.a();
        Map<? extends String, ? extends Object> c10 = u0.c();
        if (map != null) {
            map.putAll(a10);
        }
        if (map2 != null) {
            map2.putAll(c10);
        }
        for (ViewManager viewManager : list) {
            String name = viewManager.getName();
            com.facebook.systrace.b.a(0L, "UIManagerModuleConstantsHelper.createConstants").b("ViewManager", name).b("Lazy", Boolean.FALSE).c();
            try {
                Map<String, Object> c11 = c(viewManager, null, null, map, map2);
                if (!c11.isEmpty()) {
                    b10.put(name, c11);
                }
            } finally {
                com.facebook.systrace.b.b(0L);
            }
        }
        b10.put("genericBubblingEventTypes", a10);
        b10.put("genericDirectEventTypes", c10);
        return b10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> c(ViewManager viewManager, Map map, Map map2, Map map3, Map map4) {
        HashMap b10 = h6.e.b();
        Map<String, Object> exportedCustomBubblingEventTypeConstants = viewManager.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants != null) {
            e(map3, exportedCustomBubblingEventTypeConstants);
            e(exportedCustomBubblingEventTypeConstants, map);
            b10.put("bubblingEventTypes", exportedCustomBubblingEventTypeConstants);
        } else if (map != null) {
            b10.put("bubblingEventTypes", map);
        }
        Map<String, Object> exportedCustomDirectEventTypeConstants = viewManager.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants != null) {
            e(map4, exportedCustomDirectEventTypeConstants);
            e(exportedCustomDirectEventTypeConstants, map2);
            b10.put("directEventTypes", exportedCustomDirectEventTypeConstants);
        } else if (map2 != null) {
            b10.put("directEventTypes", map2);
        }
        Map<String, Object> exportedViewConstants = viewManager.getExportedViewConstants();
        if (exportedViewConstants != null) {
            b10.put("Constants", exportedViewConstants);
        }
        Map<String, Integer> commandsMap = viewManager.getCommandsMap();
        if (commandsMap != null) {
            b10.put("Commands", commandsMap);
        }
        Map<String, String> nativeProps = viewManager.getNativeProps();
        if (!nativeProps.isEmpty()) {
            b10.put("NativeProps", nativeProps);
        }
        return b10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> d() {
        return h6.e.e("bubblingEventTypes", u0.a(), "directEventTypes", u0.c());
    }

    private static void e(Map map, Map map2) {
        if (map == null || map2 == null || map2.isEmpty()) {
            return;
        }
        for (Object obj : map2.keySet()) {
            Object obj2 = map2.get(obj);
            Object obj3 = map.get(obj);
            if (obj3 != null && (obj2 instanceof Map) && (obj3 instanceof Map)) {
                e((Map) obj3, (Map) obj2);
            } else {
                map.put(obj, obj2);
            }
        }
    }
}
