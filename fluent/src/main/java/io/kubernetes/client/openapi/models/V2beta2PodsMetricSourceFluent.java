package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2beta2PodsMetricSourceFluent<A extends io.kubernetes.client.openapi.models.V2beta2PodsMetricSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildMetric instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2beta2MetricIdentifier getMetric();
  public io.kubernetes.client.openapi.models.V2beta2MetricIdentifier buildMetric();
  public A withMetric(io.kubernetes.client.openapi.models.V2beta2MetricIdentifier metric);
  public java.lang.Boolean hasMetric();
  public io.kubernetes.client.openapi.models.V2beta2PodsMetricSourceFluent.MetricNested<A> withNewMetric();
  public io.kubernetes.client.openapi.models.V2beta2PodsMetricSourceFluent.MetricNested<A> withNewMetricLike(io.kubernetes.client.openapi.models.V2beta2MetricIdentifier item);
  public io.kubernetes.client.openapi.models.V2beta2PodsMetricSourceFluent.MetricNested<A> editMetric();
  public io.kubernetes.client.openapi.models.V2beta2PodsMetricSourceFluent.MetricNested<A> editOrNewMetric();
  public io.kubernetes.client.openapi.models.V2beta2PodsMetricSourceFluent.MetricNested<A> editOrNewMetricLike(io.kubernetes.client.openapi.models.V2beta2MetricIdentifier item);
  
  /**
   * This method has been deprecated, please use method buildTarget instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2beta2MetricTarget getTarget();
  public io.kubernetes.client.openapi.models.V2beta2MetricTarget buildTarget();
  public A withTarget(io.kubernetes.client.openapi.models.V2beta2MetricTarget target);
  public java.lang.Boolean hasTarget();
  public io.kubernetes.client.openapi.models.V2beta2PodsMetricSourceFluent.TargetNested<A> withNewTarget();
  public io.kubernetes.client.openapi.models.V2beta2PodsMetricSourceFluent.TargetNested<A> withNewTargetLike(io.kubernetes.client.openapi.models.V2beta2MetricTarget item);
  public io.kubernetes.client.openapi.models.V2beta2PodsMetricSourceFluent.TargetNested<A> editTarget();
  public io.kubernetes.client.openapi.models.V2beta2PodsMetricSourceFluent.TargetNested<A> editOrNewTarget();
  public io.kubernetes.client.openapi.models.V2beta2PodsMetricSourceFluent.TargetNested<A> editOrNewTargetLike(io.kubernetes.client.openapi.models.V2beta2MetricTarget item);
  public interface MetricNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta2MetricIdentifierFluent<io.kubernetes.client.openapi.models.V2beta2PodsMetricSourceFluent.MetricNested<N>>{
    public N and();
    public N endMetric();
    
  }
  public interface TargetNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta2MetricTargetFluent<io.kubernetes.client.openapi.models.V2beta2PodsMetricSourceFluent.TargetNested<N>>{
    public N and();
    public N endTarget();
    
  }
  
}