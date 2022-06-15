/*
 * Nomad
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.1.4
 * Contact: support@hashicorp.com
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct JobScaleStatusResponse {
    #[serde(rename = "JobCreateIndex", skip_serializing_if = "Option::is_none")]
    pub job_create_index: Option<i32>,
    #[serde(rename = "JobID", skip_serializing_if = "Option::is_none")]
    pub job_id: Option<String>,
    #[serde(rename = "JobModifyIndex", skip_serializing_if = "Option::is_none")]
    pub job_modify_index: Option<i32>,
    #[serde(rename = "JobStopped", skip_serializing_if = "Option::is_none")]
    pub job_stopped: Option<bool>,
    #[serde(rename = "Namespace", skip_serializing_if = "Option::is_none")]
    pub namespace: Option<String>,
    #[serde(rename = "TaskGroups", skip_serializing_if = "Option::is_none")]
    pub task_groups: Option<::std::collections::HashMap<String, crate::models::TaskGroupScaleStatus>>,
}

impl JobScaleStatusResponse {
    pub fn new() -> JobScaleStatusResponse {
        JobScaleStatusResponse {
            job_create_index: None,
            job_id: None,
            job_modify_index: None,
            job_stopped: None,
            namespace: None,
            task_groups: None,
        }
    }
}


