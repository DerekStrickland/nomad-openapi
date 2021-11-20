/*
 * Nomad
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.1.4
 * Contact: support@hashicorp.com
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct ConsulLinkedService {
    #[serde(rename = "CAFile", skip_serializing_if = "Option::is_none")]
    pub ca_file: Option<String>,
    #[serde(rename = "CertFile", skip_serializing_if = "Option::is_none")]
    pub cert_file: Option<String>,
    #[serde(rename = "KeyFile", skip_serializing_if = "Option::is_none")]
    pub key_file: Option<String>,
    #[serde(rename = "Name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    #[serde(rename = "SNI", skip_serializing_if = "Option::is_none")]
    pub SNI: Option<String>,
}

impl ConsulLinkedService {
    pub fn new() -> ConsulLinkedService {
        ConsulLinkedService {
            ca_file: None,
            cert_file: None,
            key_file: None,
            name: None,
            SNI: None,
        }
    }
}

