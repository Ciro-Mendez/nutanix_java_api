package com.nutanix.api;

public class EntitiesVO {
     String service_vmid ="";
    String  uuid ="";
    //disk_hardware_configs
    String name ="";
    String service_vmexternal_ip ="";
    String service_vmnat_ip ="";
    String  service_vmnat_port ="";
    String oplog_disk_pc ="";
    String  oplog_disk_size ="";
    String hypervisor_key ="";
    String  hypervisor_address ="";
    String hypervisor_username ="";
    String  hypervisor_password ="";
    String backplane_ip ="";
    String  controller_vm_backplane_ip ="";
    String rdma_backplane_ips ="";
    String  management_server_name ="";
    String ipmi_address ="";
    String  ipmi_username ="";
    String ipmi_password ="";
    String  monitored ="";
    //position
    String serial ="";
    String  block_serial ="";
    String block_model ="";
    String  block_model_name ="";
    String block_location ="";
    String  host_maintenance_mode_reason ="";
    String hypervisor_state ="";
    String  metadata_store_status ="";
    String metadata_store_status_message ="";
    String  state ="";
    String dynamic_ring_changing_node ="";
    String  vzone_name ="";
    String cpu_model ="";
    String  num_cpu_cores ="";
    String num_cpu_threads ="";
    String  num_cpu_sockets ="";
    String cpu_frequency_in_hz ="";
    String  cpu_capacity_in_hz ="";
    String memory_capacity_in_bytes ="";
    String  hypervisor_full_name ="";
    String hypervisor_type ="";
    String  num_vms ="";
    String boot_time_in_usecs ="";
    String  is_degraded ="";
    String failover_cluster_fqdn ="";
    String  failover_cluster_node_state ="";
    String reboot_pending ="";
    String  default_vm_location ="";
    String default_vm_storage_container_id ="";
    String  default_vm_storage_container_uuid ="";
    String   default_vhd_location ="";
    String   default_vhd_storage_container_id ="";
    String           default_vhd_storage_container_uuid ="";
    String           bios_version ="";
    String           bios_model ="";
    String           bmc_version ="";
    String           bmc_model ="";
                     //hba_firmwares_list
                     String           cluster_uuid ="";
              //       stats:{  },
            //usage_stats:{  },
              String has_csr ="";
            //host_nic_ids:[  ],
            String host_gpus ="";
    String gpu_driver_version ="";
    String host_type ="";
            //key_management_device_to_certificate_status:{  },
            String  host_in_maintenance_mode ="";

    public String getService_vmid() {
        return service_vmid;
    }

    public void setService_vmid(String service_vmid) {
        this.service_vmid = service_vmid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getService_vmexternal_ip() {
        return service_vmexternal_ip;
    }

    public void setService_vmexternal_ip(String service_vmexternal_ip) {
        this.service_vmexternal_ip = service_vmexternal_ip;
    }

    public String getService_vmnat_ip() {
        return service_vmnat_ip;
    }

    public void setService_vmnat_ip(String service_vmnat_ip) {
        this.service_vmnat_ip = service_vmnat_ip;
    }

    public String getService_vmnat_port() {
        return service_vmnat_port;
    }

    public void setService_vmnat_port(String service_vmnat_port) {
        this.service_vmnat_port = service_vmnat_port;
    }

    public String getOplog_disk_pc() {
        return oplog_disk_pc;
    }

    public void setOplog_disk_pc(String oplog_disk_pc) {
        this.oplog_disk_pc = oplog_disk_pc;
    }

    public String getOplog_disk_size() {
        return oplog_disk_size;
    }

    public void setOplog_disk_size(String oplog_disk_size) {
        this.oplog_disk_size = oplog_disk_size;
    }

    public String getHypervisor_key() {
        return hypervisor_key;
    }

    public void setHypervisor_key(String hypervisor_key) {
        this.hypervisor_key = hypervisor_key;
    }

    public String getHypervisor_address() {
        return hypervisor_address;
    }

    public void setHypervisor_address(String hypervisor_address) {
        this.hypervisor_address = hypervisor_address;
    }

    public String getHypervisor_username() {
        return hypervisor_username;
    }

    public void setHypervisor_username(String hypervisor_username) {
        this.hypervisor_username = hypervisor_username;
    }

    public String getHypervisor_password() {
        return hypervisor_password;
    }

    public void setHypervisor_password(String hypervisor_password) {
        this.hypervisor_password = hypervisor_password;
    }

    public String getBackplane_ip() {
        return backplane_ip;
    }

    public void setBackplane_ip(String backplane_ip) {
        this.backplane_ip = backplane_ip;
    }

    public String getController_vm_backplane_ip() {
        return controller_vm_backplane_ip;
    }

    public void setController_vm_backplane_ip(String controller_vm_backplane_ip) {
        this.controller_vm_backplane_ip = controller_vm_backplane_ip;
    }

    public String getRdma_backplane_ips() {
        return rdma_backplane_ips;
    }

    public void setRdma_backplane_ips(String rdma_backplane_ips) {
        this.rdma_backplane_ips = rdma_backplane_ips;
    }

    public String getManagement_server_name() {
        return management_server_name;
    }

    public void setManagement_server_name(String management_server_name) {
        this.management_server_name = management_server_name;
    }

    public String getIpmi_address() {
        return ipmi_address;
    }

    public void setIpmi_address(String ipmi_address) {
        this.ipmi_address = ipmi_address;
    }

    public String getIpmi_username() {
        return ipmi_username;
    }

    public void setIpmi_username(String ipmi_username) {
        this.ipmi_username = ipmi_username;
    }

    public String getIpmi_password() {
        return ipmi_password;
    }

    public void setIpmi_password(String ipmi_password) {
        this.ipmi_password = ipmi_password;
    }

    public String getMonitored() {
        return monitored;
    }

    public void setMonitored(String monitored) {
        this.monitored = monitored;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getBlock_serial() {
        return block_serial;
    }

    public void setBlock_serial(String block_serial) {
        this.block_serial = block_serial;
    }

    public String getBlock_model() {
        return block_model;
    }

    public void setBlock_model(String block_model) {
        this.block_model = block_model;
    }

    public String getBlock_model_name() {
        return block_model_name;
    }

    public void setBlock_model_name(String block_model_name) {
        this.block_model_name = block_model_name;
    }

    public String getBlock_location() {
        return block_location;
    }

    public void setBlock_location(String block_location) {
        this.block_location = block_location;
    }

    public String getHost_maintenance_mode_reason() {
        return host_maintenance_mode_reason;
    }

    public void setHost_maintenance_mode_reason(String host_maintenance_mode_reason) {
        this.host_maintenance_mode_reason = host_maintenance_mode_reason;
    }

    public String getHypervisor_state() {
        return hypervisor_state;
    }

    public void setHypervisor_state(String hypervisor_state) {
        this.hypervisor_state = hypervisor_state;
    }

    public String getMetadata_store_status() {
        return metadata_store_status;
    }

    public void setMetadata_store_status(String metadata_store_status) {
        this.metadata_store_status = metadata_store_status;
    }

    public String getMetadata_store_status_message() {
        return metadata_store_status_message;
    }

    public void setMetadata_store_status_message(String metadata_store_status_message) {
        this.metadata_store_status_message = metadata_store_status_message;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDynamic_ring_changing_node() {
        return dynamic_ring_changing_node;
    }

    public void setDynamic_ring_changing_node(String dynamic_ring_changing_node) {
        this.dynamic_ring_changing_node = dynamic_ring_changing_node;
    }

    public String getVzone_name() {
        return vzone_name;
    }

    public void setVzone_name(String vzone_name) {
        this.vzone_name = vzone_name;
    }

    public String getCpu_model() {
        return cpu_model;
    }

    public void setCpu_model(String cpu_model) {
        this.cpu_model = cpu_model;
    }

    public String getNum_cpu_cores() {
        return num_cpu_cores;
    }

    public void setNum_cpu_cores(String num_cpu_cores) {
        this.num_cpu_cores = num_cpu_cores;
    }

    public String getNum_cpu_threads() {
        return num_cpu_threads;
    }

    public void setNum_cpu_threads(String num_cpu_threads) {
        this.num_cpu_threads = num_cpu_threads;
    }

    public String getNum_cpu_sockets() {
        return num_cpu_sockets;
    }

    public void setNum_cpu_sockets(String num_cpu_sockets) {
        this.num_cpu_sockets = num_cpu_sockets;
    }

    public String getCpu_frequency_in_hz() {
        return cpu_frequency_in_hz;
    }

    public void setCpu_frequency_in_hz(String cpu_frequency_in_hz) {
        this.cpu_frequency_in_hz = cpu_frequency_in_hz;
    }

    public String getCpu_capacity_in_hz() {
        return cpu_capacity_in_hz;
    }

    public void setCpu_capacity_in_hz(String cpu_capacity_in_hz) {
        this.cpu_capacity_in_hz = cpu_capacity_in_hz;
    }

    public String getMemory_capacity_in_bytes() {
        return memory_capacity_in_bytes;
    }

    public void setMemory_capacity_in_bytes(String memory_capacity_in_bytes) {
        this.memory_capacity_in_bytes = memory_capacity_in_bytes;
    }

    public String getHypervisor_full_name() {
        return hypervisor_full_name;
    }

    public void setHypervisor_full_name(String hypervisor_full_name) {
        this.hypervisor_full_name = hypervisor_full_name;
    }

    public String getHypervisor_type() {
        return hypervisor_type;
    }

    public void setHypervisor_type(String hypervisor_type) {
        this.hypervisor_type = hypervisor_type;
    }

    public String getNum_vms() {
        return num_vms;
    }

    public void setNum_vms(String num_vms) {
        this.num_vms = num_vms;
    }

    public String getBoot_time_in_usecs() {
        return boot_time_in_usecs;
    }

    public void setBoot_time_in_usecs(String boot_time_in_usecs) {
        this.boot_time_in_usecs = boot_time_in_usecs;
    }

    public String getIs_degraded() {
        return is_degraded;
    }

    public void setIs_degraded(String is_degraded) {
        this.is_degraded = is_degraded;
    }

    public String getFailover_cluster_fqdn() {
        return failover_cluster_fqdn;
    }

    public void setFailover_cluster_fqdn(String failover_cluster_fqdn) {
        this.failover_cluster_fqdn = failover_cluster_fqdn;
    }

    public String getFailover_cluster_node_state() {
        return failover_cluster_node_state;
    }

    public void setFailover_cluster_node_state(String failover_cluster_node_state) {
        this.failover_cluster_node_state = failover_cluster_node_state;
    }

    public String getReboot_pending() {
        return reboot_pending;
    }

    public void setReboot_pending(String reboot_pending) {
        this.reboot_pending = reboot_pending;
    }

    public String getDefault_vm_location() {
        return default_vm_location;
    }

    public void setDefault_vm_location(String default_vm_location) {
        this.default_vm_location = default_vm_location;
    }

    public String getDefault_vm_storage_container_id() {
        return default_vm_storage_container_id;
    }

    public void setDefault_vm_storage_container_id(String default_vm_storage_container_id) {
        this.default_vm_storage_container_id = default_vm_storage_container_id;
    }

    public String getDefault_vm_storage_container_uuid() {
        return default_vm_storage_container_uuid;
    }

    public void setDefault_vm_storage_container_uuid(String default_vm_storage_container_uuid) {
        this.default_vm_storage_container_uuid = default_vm_storage_container_uuid;
    }

    public String getDefault_vhd_location() {
        return default_vhd_location;
    }

    public void setDefault_vhd_location(String default_vhd_location) {
        this.default_vhd_location = default_vhd_location;
    }

    public String getDefault_vhd_storage_container_id() {
        return default_vhd_storage_container_id;
    }

    public void setDefault_vhd_storage_container_id(String default_vhd_storage_container_id) {
        this.default_vhd_storage_container_id = default_vhd_storage_container_id;
    }

    public String getDefault_vhd_storage_container_uuid() {
        return default_vhd_storage_container_uuid;
    }

    public void setDefault_vhd_storage_container_uuid(String default_vhd_storage_container_uuid) {
        this.default_vhd_storage_container_uuid = default_vhd_storage_container_uuid;
    }

    public String getBios_version() {
        return bios_version;
    }

    public void setBios_version(String bios_version) {
        this.bios_version = bios_version;
    }

    public String getBios_model() {
        return bios_model;
    }

    public void setBios_model(String bios_model) {
        this.bios_model = bios_model;
    }

    public String getBmc_version() {
        return bmc_version;
    }

    public void setBmc_version(String bmc_version) {
        this.bmc_version = bmc_version;
    }

    public String getBmc_model() {
        return bmc_model;
    }

    public void setBmc_model(String bmc_model) {
        this.bmc_model = bmc_model;
    }

    public String getCluster_uuid() {
        return cluster_uuid;
    }

    public void setCluster_uuid(String cluster_uuid) {
        this.cluster_uuid = cluster_uuid;
    }

    public String getHas_csr() {
        return has_csr;
    }

    public void setHas_csr(String has_csr) {
        this.has_csr = has_csr;
    }

    public String getHost_gpus() {
        return host_gpus;
    }

    public void setHost_gpus(String host_gpus) {
        this.host_gpus = host_gpus;
    }

    public String getGpu_driver_version() {
        return gpu_driver_version;
    }

    public void setGpu_driver_version(String gpu_driver_version) {
        this.gpu_driver_version = gpu_driver_version;
    }

    public String getHost_type() {
        return host_type;
    }

    public void setHost_type(String host_type) {
        this.host_type = host_type;
    }

    public String getHost_in_maintenance_mode() {
        return host_in_maintenance_mode;
    }

    public void setHost_in_maintenance_mode(String host_in_maintenance_mode) {
        this.host_in_maintenance_mode = host_in_maintenance_mode;
    }
}
