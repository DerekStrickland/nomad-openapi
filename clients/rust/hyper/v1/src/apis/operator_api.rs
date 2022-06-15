/*
 * Nomad
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.1.4
 * Contact: support@hashicorp.com
 * Generated by: https://openapi-generator.tech
 */

use std::rc::Rc;
use std::borrow::Borrow;
use std::pin::Pin;
#[allow(unused_imports)]
use std::option::Option;

use hyper;
use futures::Future;

use super::{Error, configuration};
use super::request as __internal_request;

pub struct OperatorApiClient<C: hyper::client::connect::Connect>
    where C: Clone + std::marker::Send + Sync + 'static {
    configuration: Rc<configuration::Configuration<C>>,
}

impl<C: hyper::client::connect::Connect> OperatorApiClient<C>
    where C: Clone + std::marker::Send + Sync {
    pub fn new(configuration: Rc<configuration::Configuration<C>>) -> OperatorApiClient<C> {
        OperatorApiClient {
            configuration,
        }
    }
}

pub trait OperatorApi {
    fn delete_operator_raft_peer(&self, region: Option<&str>, namespace: Option<&str>, x_nomad_token: Option<&str>, idempotency_token: Option<&str>) -> Pin<Box<dyn Future<Output = Result<(), Error>>>>;
    fn get_operator_autopilot_configuration(&self, region: Option<&str>, namespace: Option<&str>, index: Option<i32>, wait: Option<&str>, stale: Option<&str>, prefix: Option<&str>, x_nomad_token: Option<&str>, per_page: Option<i32>, next_token: Option<&str>) -> Pin<Box<dyn Future<Output = Result<crate::models::AutopilotConfiguration, Error>>>>;
    fn get_operator_autopilot_health(&self, region: Option<&str>, namespace: Option<&str>, index: Option<i32>, wait: Option<&str>, stale: Option<&str>, prefix: Option<&str>, x_nomad_token: Option<&str>, per_page: Option<i32>, next_token: Option<&str>) -> Pin<Box<dyn Future<Output = Result<crate::models::OperatorHealthReply, Error>>>>;
    fn get_operator_raft_configuration(&self, region: Option<&str>, namespace: Option<&str>, index: Option<i32>, wait: Option<&str>, stale: Option<&str>, prefix: Option<&str>, x_nomad_token: Option<&str>, per_page: Option<i32>, next_token: Option<&str>) -> Pin<Box<dyn Future<Output = Result<crate::models::RaftConfiguration, Error>>>>;
    fn get_operator_scheduler_configuration(&self, region: Option<&str>, namespace: Option<&str>, index: Option<i32>, wait: Option<&str>, stale: Option<&str>, prefix: Option<&str>, x_nomad_token: Option<&str>, per_page: Option<i32>, next_token: Option<&str>) -> Pin<Box<dyn Future<Output = Result<crate::models::SchedulerConfigurationResponse, Error>>>>;
    fn post_operator_scheduler_configuration(&self, scheduler_configuration: Option<crate::models::SchedulerConfiguration>, region: Option<&str>, namespace: Option<&str>, x_nomad_token: Option<&str>, idempotency_token: Option<&str>) -> Pin<Box<dyn Future<Output = Result<crate::models::SchedulerSetConfigurationResponse, Error>>>>;
    fn put_operator_autopilot_configuration(&self, autopilot_configuration: Option<crate::models::AutopilotConfiguration>, region: Option<&str>, namespace: Option<&str>, x_nomad_token: Option<&str>, idempotency_token: Option<&str>) -> Pin<Box<dyn Future<Output = Result<bool, Error>>>>;
}

impl<C: hyper::client::connect::Connect>OperatorApi for OperatorApiClient<C>
    where C: Clone + std::marker::Send + Sync {
    #[allow(unused_mut)]
    fn delete_operator_raft_peer(&self, region: Option<&str>, namespace: Option<&str>, x_nomad_token: Option<&str>, idempotency_token: Option<&str>) -> Pin<Box<dyn Future<Output = Result<(), Error>>>> {
        let mut req = __internal_request::Request::new(hyper::Method::DELETE, "/operator/raft/peer".to_string())
            .with_auth(__internal_request::Auth::ApiKey(__internal_request::ApiKey{
                in_header: true,
                in_query: false,
                param_name: "X-Nomad-Token".to_owned(),
            }))
        ;
        if let Some(ref s) = region {
            let query_value = s.to_string();
            req = req.with_query_param("region".to_string(), query_value);
        }
        if let Some(ref s) = namespace {
            let query_value = s.to_string();
            req = req.with_query_param("namespace".to_string(), query_value);
        }
        if let Some(ref s) = idempotency_token {
            let query_value = s.to_string();
            req = req.with_query_param("idempotency_token".to_string(), query_value);
        }
        if let Some(param_value) = x_nomad_token {
            req = req.with_header_param("X-Nomad-Token".to_string(), param_value.to_string());
        }
        req = req.returns_nothing();

        req.execute(self.configuration.borrow())
    }

    #[allow(unused_mut)]
    fn get_operator_autopilot_configuration(&self, region: Option<&str>, namespace: Option<&str>, index: Option<i32>, wait: Option<&str>, stale: Option<&str>, prefix: Option<&str>, x_nomad_token: Option<&str>, per_page: Option<i32>, next_token: Option<&str>) -> Pin<Box<dyn Future<Output = Result<crate::models::AutopilotConfiguration, Error>>>> {
        let mut req = __internal_request::Request::new(hyper::Method::GET, "/operator/autopilot/configuration".to_string())
            .with_auth(__internal_request::Auth::ApiKey(__internal_request::ApiKey{
                in_header: true,
                in_query: false,
                param_name: "X-Nomad-Token".to_owned(),
            }))
        ;
        if let Some(ref s) = region {
            let query_value = s.to_string();
            req = req.with_query_param("region".to_string(), query_value);
        }
        if let Some(ref s) = namespace {
            let query_value = s.to_string();
            req = req.with_query_param("namespace".to_string(), query_value);
        }
        if let Some(ref s) = wait {
            let query_value = s.to_string();
            req = req.with_query_param("wait".to_string(), query_value);
        }
        if let Some(ref s) = stale {
            let query_value = s.to_string();
            req = req.with_query_param("stale".to_string(), query_value);
        }
        if let Some(ref s) = prefix {
            let query_value = s.to_string();
            req = req.with_query_param("prefix".to_string(), query_value);
        }
        if let Some(ref s) = per_page {
            let query_value = s.to_string();
            req = req.with_query_param("per_page".to_string(), query_value);
        }
        if let Some(ref s) = next_token {
            let query_value = s.to_string();
            req = req.with_query_param("next_token".to_string(), query_value);
        }
        if let Some(param_value) = index {
            req = req.with_header_param("index".to_string(), param_value.to_string());
        }
        if let Some(param_value) = x_nomad_token {
            req = req.with_header_param("X-Nomad-Token".to_string(), param_value.to_string());
        }

        req.execute(self.configuration.borrow())
    }

    #[allow(unused_mut)]
    fn get_operator_autopilot_health(&self, region: Option<&str>, namespace: Option<&str>, index: Option<i32>, wait: Option<&str>, stale: Option<&str>, prefix: Option<&str>, x_nomad_token: Option<&str>, per_page: Option<i32>, next_token: Option<&str>) -> Pin<Box<dyn Future<Output = Result<crate::models::OperatorHealthReply, Error>>>> {
        let mut req = __internal_request::Request::new(hyper::Method::GET, "/operator/autopilot/health".to_string())
            .with_auth(__internal_request::Auth::ApiKey(__internal_request::ApiKey{
                in_header: true,
                in_query: false,
                param_name: "X-Nomad-Token".to_owned(),
            }))
        ;
        if let Some(ref s) = region {
            let query_value = s.to_string();
            req = req.with_query_param("region".to_string(), query_value);
        }
        if let Some(ref s) = namespace {
            let query_value = s.to_string();
            req = req.with_query_param("namespace".to_string(), query_value);
        }
        if let Some(ref s) = wait {
            let query_value = s.to_string();
            req = req.with_query_param("wait".to_string(), query_value);
        }
        if let Some(ref s) = stale {
            let query_value = s.to_string();
            req = req.with_query_param("stale".to_string(), query_value);
        }
        if let Some(ref s) = prefix {
            let query_value = s.to_string();
            req = req.with_query_param("prefix".to_string(), query_value);
        }
        if let Some(ref s) = per_page {
            let query_value = s.to_string();
            req = req.with_query_param("per_page".to_string(), query_value);
        }
        if let Some(ref s) = next_token {
            let query_value = s.to_string();
            req = req.with_query_param("next_token".to_string(), query_value);
        }
        if let Some(param_value) = index {
            req = req.with_header_param("index".to_string(), param_value.to_string());
        }
        if let Some(param_value) = x_nomad_token {
            req = req.with_header_param("X-Nomad-Token".to_string(), param_value.to_string());
        }

        req.execute(self.configuration.borrow())
    }

    #[allow(unused_mut)]
    fn get_operator_raft_configuration(&self, region: Option<&str>, namespace: Option<&str>, index: Option<i32>, wait: Option<&str>, stale: Option<&str>, prefix: Option<&str>, x_nomad_token: Option<&str>, per_page: Option<i32>, next_token: Option<&str>) -> Pin<Box<dyn Future<Output = Result<crate::models::RaftConfiguration, Error>>>> {
        let mut req = __internal_request::Request::new(hyper::Method::GET, "/operator/raft/configuration".to_string())
            .with_auth(__internal_request::Auth::ApiKey(__internal_request::ApiKey{
                in_header: true,
                in_query: false,
                param_name: "X-Nomad-Token".to_owned(),
            }))
        ;
        if let Some(ref s) = region {
            let query_value = s.to_string();
            req = req.with_query_param("region".to_string(), query_value);
        }
        if let Some(ref s) = namespace {
            let query_value = s.to_string();
            req = req.with_query_param("namespace".to_string(), query_value);
        }
        if let Some(ref s) = wait {
            let query_value = s.to_string();
            req = req.with_query_param("wait".to_string(), query_value);
        }
        if let Some(ref s) = stale {
            let query_value = s.to_string();
            req = req.with_query_param("stale".to_string(), query_value);
        }
        if let Some(ref s) = prefix {
            let query_value = s.to_string();
            req = req.with_query_param("prefix".to_string(), query_value);
        }
        if let Some(ref s) = per_page {
            let query_value = s.to_string();
            req = req.with_query_param("per_page".to_string(), query_value);
        }
        if let Some(ref s) = next_token {
            let query_value = s.to_string();
            req = req.with_query_param("next_token".to_string(), query_value);
        }
        if let Some(param_value) = index {
            req = req.with_header_param("index".to_string(), param_value.to_string());
        }
        if let Some(param_value) = x_nomad_token {
            req = req.with_header_param("X-Nomad-Token".to_string(), param_value.to_string());
        }

        req.execute(self.configuration.borrow())
    }

    #[allow(unused_mut)]
    fn get_operator_scheduler_configuration(&self, region: Option<&str>, namespace: Option<&str>, index: Option<i32>, wait: Option<&str>, stale: Option<&str>, prefix: Option<&str>, x_nomad_token: Option<&str>, per_page: Option<i32>, next_token: Option<&str>) -> Pin<Box<dyn Future<Output = Result<crate::models::SchedulerConfigurationResponse, Error>>>> {
        let mut req = __internal_request::Request::new(hyper::Method::GET, "/operator/scheduler/configuration".to_string())
            .with_auth(__internal_request::Auth::ApiKey(__internal_request::ApiKey{
                in_header: true,
                in_query: false,
                param_name: "X-Nomad-Token".to_owned(),
            }))
        ;
        if let Some(ref s) = region {
            let query_value = s.to_string();
            req = req.with_query_param("region".to_string(), query_value);
        }
        if let Some(ref s) = namespace {
            let query_value = s.to_string();
            req = req.with_query_param("namespace".to_string(), query_value);
        }
        if let Some(ref s) = wait {
            let query_value = s.to_string();
            req = req.with_query_param("wait".to_string(), query_value);
        }
        if let Some(ref s) = stale {
            let query_value = s.to_string();
            req = req.with_query_param("stale".to_string(), query_value);
        }
        if let Some(ref s) = prefix {
            let query_value = s.to_string();
            req = req.with_query_param("prefix".to_string(), query_value);
        }
        if let Some(ref s) = per_page {
            let query_value = s.to_string();
            req = req.with_query_param("per_page".to_string(), query_value);
        }
        if let Some(ref s) = next_token {
            let query_value = s.to_string();
            req = req.with_query_param("next_token".to_string(), query_value);
        }
        if let Some(param_value) = index {
            req = req.with_header_param("index".to_string(), param_value.to_string());
        }
        if let Some(param_value) = x_nomad_token {
            req = req.with_header_param("X-Nomad-Token".to_string(), param_value.to_string());
        }

        req.execute(self.configuration.borrow())
    }

    #[allow(unused_mut)]
    fn post_operator_scheduler_configuration(&self, scheduler_configuration: Option<crate::models::SchedulerConfiguration>, region: Option<&str>, namespace: Option<&str>, x_nomad_token: Option<&str>, idempotency_token: Option<&str>) -> Pin<Box<dyn Future<Output = Result<crate::models::SchedulerSetConfigurationResponse, Error>>>> {
        let mut req = __internal_request::Request::new(hyper::Method::POST, "/operator/scheduler/configuration".to_string())
            .with_auth(__internal_request::Auth::ApiKey(__internal_request::ApiKey{
                in_header: true,
                in_query: false,
                param_name: "X-Nomad-Token".to_owned(),
            }))
        ;
        if let Some(ref s) = region {
            let query_value = s.to_string();
            req = req.with_query_param("region".to_string(), query_value);
        }
        if let Some(ref s) = namespace {
            let query_value = s.to_string();
            req = req.with_query_param("namespace".to_string(), query_value);
        }
        if let Some(ref s) = idempotency_token {
            let query_value = s.to_string();
            req = req.with_query_param("idempotency_token".to_string(), query_value);
        }
        if let Some(param_value) = x_nomad_token {
            req = req.with_header_param("X-Nomad-Token".to_string(), param_value.to_string());
        }
        req = req.with_body_param(scheduler_configuration);

        req.execute(self.configuration.borrow())
    }

    #[allow(unused_mut)]
    fn put_operator_autopilot_configuration(&self, autopilot_configuration: Option<crate::models::AutopilotConfiguration>, region: Option<&str>, namespace: Option<&str>, x_nomad_token: Option<&str>, idempotency_token: Option<&str>) -> Pin<Box<dyn Future<Output = Result<bool, Error>>>> {
        let mut req = __internal_request::Request::new(hyper::Method::PUT, "/operator/autopilot/configuration".to_string())
            .with_auth(__internal_request::Auth::ApiKey(__internal_request::ApiKey{
                in_header: true,
                in_query: false,
                param_name: "X-Nomad-Token".to_owned(),
            }))
        ;
        if let Some(ref s) = region {
            let query_value = s.to_string();
            req = req.with_query_param("region".to_string(), query_value);
        }
        if let Some(ref s) = namespace {
            let query_value = s.to_string();
            req = req.with_query_param("namespace".to_string(), query_value);
        }
        if let Some(ref s) = idempotency_token {
            let query_value = s.to_string();
            req = req.with_query_param("idempotency_token".to_string(), query_value);
        }
        if let Some(param_value) = x_nomad_token {
            req = req.with_header_param("X-Nomad-Token".to_string(), param_value.to_string());
        }
        req = req.with_body_param(autopilot_configuration);

        req.execute(self.configuration.borrow())
    }

}
