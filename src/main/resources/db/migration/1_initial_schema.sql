create table exercises
(
    id                           uuid                                                                                                             not null
        primary key,
    brachialis                   double                                                                                                           null,
    deltoid_anterior             double                                                                                                           null,
    deltoid_lateral              double                                                                                                           null,
    deltoid_posterior            double                                                                                                           null,
    equipment_category           enum ('BARBELL', 'BODYWEIGHT', 'DUMBBELL', 'MACHINE')                                                            null,
    erector_spinae               double                                                                                                           null,
    exercise_type                enum ('ASSISTED_BODY', 'DISTANCE_DURATION', 'DURATION', 'REPS', 'WEIGHT_BODY', 'WEIGHT_DURATION', 'WEIGHT_REPS') null,
    external_obliques            double                                                                                                           null,
    forearm_extensors            double                                                                                                           null,
    forearm_flexors              double                                                                                                           null,
    gastrocnemius                double                                                                                                           null,
    gluteus_maximus              double                                                                                                           null,
    gluteus_medius               double                                                                                                           null,
    hamstrings                   double                                                                                                           null,
    internal_obliques            double                                                                                                           null,
    lateral_head_triceps_brachii double                                                                                                           null,
    latissimus_dorsi             double                                                                                                           null,
    long_head_biceps_brachii     double                                                                                                           null,
    long_head_triceps_brachii    double                                                                                                           null,
    lower_pectoralis_major       double                                                                                                           null,
    lower_rectus_abdominis       double                                                                                                           null,
    lower_trapezius              double                                                                                                           null,
    medial_head_triceps_brachii  double                                                                                                           null,
    middle_pectoralis_major      double                                                                                                           null,
    middle_trapezius             double                                                                                                           null,
    pectoralis_minor             double                                                                                                           null,
    priority                     int                                                                                                              null,
    quadriceps_femoris           double                                                                                                           null,
    rhomboids                    double                                                                                                           null,
    short_head_biceps_brachii    double                                                                                                           null,
    soleus                       double                                                                                                           null,
    sternocleidomastoid          double                                                                                                           null,
    tibialis_anterior            double                                                                                                           null,
    title                        varchar(255)                                                                                                     null,
    transversus_abdominis        double                                                                                                           null,
    upper_rectus_abdominis       double                                                                                                           null,
    upper_pectoralis_major       double                                                                                                           null,
    upper_trapezius              double                                                                                                           null,
    volume_doubling_enabled      bit                                                                                                              null,
    created_at                   datetime(6)                                                                                                      null,
    updated_at                   datetime(6)                                                                                                      null,
    user_id                      uuid                                                                                                             null,
    uper_rectus_abdominis        double                                                                                                           null
);

create table person
(
    id         uuid                    not null
        primary key,
    created_at datetime(6)             null,
    updated_at datetime(6)             null,
    user_id    uuid                    null,
    birthdate  datetime(6)             null,
    gender     enum ('FEMALE', 'MALE') null,
    height     double                  null,
    weight     double                  null
);

create table user
(
    id         uuid         not null
        primary key,
    created_at datetime(6)  null,
    updated_at datetime(6)  null,
    user_id    uuid         null,
    email      varchar(255) null,
    password   varchar(255) not null,
    role       varchar(255) not null
);

create table workout_exercises
(
    id           uuid        not null
        primary key,
    created_at   datetime(6) null,
    updated_at   datetime(6) null,
    user_id      uuid        null,
    exercise_id  uuid        not null,
    notes        text        null,
    rest_seconds int         null,
    superset_id  int         null,
    workout_id   uuid        not null
);

create table exercise_sets
(
    id          uuid                                            not null
        primary key,
    created_at  datetime(6)                                     null,
    updated_at  datetime(6)                                     null,
    user_id     uuid                                            null,
    indicator   enum ('DROPSET', 'FAILURE', 'NORMAL', 'WARMUP') null,
    reps        int                                             null,
    set_index   int                                             null,
    weight_kg   double                                          null,
    exercise_id uuid                                            not null,
    constraint FK9qhvono8sbietbjtbmuvo800u
        foreign key (exercise_id) references workout_exercises (id)
);

create table workouts
(
    id                  uuid         not null
        primary key,
    created_at          datetime(6)  null,
    updated_at          datetime(6)  null,
    user_id             uuid         null,
    description         text         null,
    end_time            bigint       null,
    estimated_volume_kg int          null,
    name                varchar(255) null,
    start_time          bigint       null
);