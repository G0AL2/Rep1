package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.external.InneractiveContentController.EventsListener;

/* loaded from: classes.dex */
public interface InneractiveContentController<EventsListenerT extends EventsListener> {

    /* loaded from: classes.dex */
    public interface EventsListener {
    }

    void destroy();

    InneractiveAdSpot getAdSpot();

    void setEventsListener(EventsListenerT eventslistenert);
}
