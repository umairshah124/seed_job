pipelineJobNames = ['projectA', 'projectB']
pipelineJobNames.each { jobName ->
    pipelineJob(jobName) {
      definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/umairshah124/seed_job.git')
                    }
                    branches('*/main')
                }
            }
          scriptPath("${jobName}.groovy") 
        }
    }
  }
}
