package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1AffinityBuilder extends io.kubernetes.client.openapi.models.V1AffinityFluentImpl<io.kubernetes.client.openapi.models.V1AffinityBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1Affinity,io.kubernetes.client.openapi.models.V1AffinityBuilder>{
  public V1AffinityBuilder() {
    this(false);
  }
  public V1AffinityBuilder(java.lang.Boolean validationEnabled) {
    this(new V1Affinity(), validationEnabled);
  }
  public V1AffinityBuilder(io.kubernetes.client.openapi.models.V1AffinityFluent<?> fluent) {
    this(fluent, false);
  }
  public V1AffinityBuilder(io.kubernetes.client.openapi.models.V1AffinityFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1Affinity(), validationEnabled);
  }
  public V1AffinityBuilder(io.kubernetes.client.openapi.models.V1AffinityFluent<?> fluent,io.kubernetes.client.openapi.models.V1Affinity instance) {
    this(fluent, instance, false);
  }
  public V1AffinityBuilder(io.kubernetes.client.openapi.models.V1AffinityFluent<?> fluent,io.kubernetes.client.openapi.models.V1Affinity instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withNodeAffinity(instance.getNodeAffinity());

    fluent.withPodAffinity(instance.getPodAffinity());

    fluent.withPodAntiAffinity(instance.getPodAntiAffinity());

    this.validationEnabled = validationEnabled; 
  }
  public V1AffinityBuilder(io.kubernetes.client.openapi.models.V1Affinity instance) {
    this(instance,false);
  }
  public V1AffinityBuilder(io.kubernetes.client.openapi.models.V1Affinity instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withNodeAffinity(instance.getNodeAffinity());

    this.withPodAffinity(instance.getPodAffinity());

    this.withPodAntiAffinity(instance.getPodAntiAffinity());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1AffinityFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1Affinity build() {
    V1Affinity buildable = new V1Affinity();
    buildable.setNodeAffinity(fluent.getNodeAffinity());
    buildable.setPodAffinity(fluent.getPodAffinity());
    buildable.setPodAntiAffinity(fluent.getPodAntiAffinity());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1AffinityBuilder that = (V1AffinityBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}